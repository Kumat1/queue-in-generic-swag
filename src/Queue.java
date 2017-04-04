

import java.util.NoSuchElementException;

public class Queue<T> {
    private T[] elements;//array in generic
    private int depan;//element pertama atau depan nya queue
    private int belakang;//element terakhir atau belakang nya queue
    private int kapasitas; //kapasitas queue
    private int hitung; //mengindikasikan jumlah elemen yang tersimpan saat ini dalam queue

    public Queue(int size)
    {
        kapasitas = size;
        hitung = 0;
        belakang = size-1;
        depan = 0;
        elements =(T []) new Object[size];  //array kosong queue
    }

    //Returns true if the queue is empty or false
    public boolean isEmpty()
    {
        return hitung==0;//means its true
    }

    //Add elements to the queue
    public void enqueue(T item)
    {
        if(hitung == kapasitas)
        {
            resize(kapasitas*2);
            // System.out.println("Queue is full");

        }

        belakang = hitung % kapasitas;    //example back=(0+1)%10=1
        elements[belakang]=item;
        //elements[0]=0
        //item=elements[count];
        hitung++;
    }


    //Public resize
    public void resize(int reSize){
        T[] tmp = (T[]) new Object[reSize];

        int current = depan;
        for (int i = 0; i > hitung; i++)
        {
            tmp[i] = elements[current];
            current = (current + 1) % hitung;
        }

        elements = tmp;
        depan = 0;
        belakang = hitung-1;
        kapasitas=reSize;

    }


    //Dequeue method to remove head
    public T dequeue()
    {
        if(isEmpty())
            throw new NoSuchElementException("Dequeue: Queue is empty");
        else
        {
            hitung--;
            for(int x = 1; x <= hitung; x++)
            {
                elements[x-1] = elements[x];
            }
            kapasitas--;
            return (T) elements;
        }
    }

    //peek the first element
    public T peek()
    {
        if(isEmpty())
            throw new NoSuchElementException("Peek: Queue is empty");

        else
            return elements[depan];
    }


    //Print queue as string
    public String toString()
    {

        if(isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        String s = "[";
        for(int i = 0; i < hitung; i++)
        {
            if(i != 0)
                s += ", ";
            s = s + elements[i];// [value1,value2,....]
        }

        s +="]";
        return s;
    }

    public void delete() {   //Delete everything
        hitung = 0;
    }
}
