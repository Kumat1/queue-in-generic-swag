

/**
 * Created by putriramadannia_pc on 4/1/2017.
 */
public class MainQueue {
    public static void main(String[] args) {

        int kapasitas=6;
        Queue<Integer> queue = new Queue<Integer>(kapasitas);

        queue.enqueue(1);
        System.out.println("Queue: "+ queue);
        queue.enqueue(2);
        System.out.println("Queue: "+ queue);
        queue.dequeue();
        queue.enqueue(3);
        System.out.println("Queue: "+ queue);
        queue.enqueue(4);
        System.out.println("Queue: "+ queue);
        queue.enqueue(5);
        System.out.println("Queue: "+ queue);
        queue.enqueue(6);
        System.out.println("Queue: "+ queue);

    }
}
