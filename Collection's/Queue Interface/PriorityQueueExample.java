import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(5);

        // Remove and print elements (sorted order)
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
