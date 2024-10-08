import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("John");
        queue.add("Jane");
        queue.add("Tom");

        // Peek at the front of the queue without removing
        System.out.println("Head of the queue: " + queue.peek());

        // Remove the first element
        System.out.println("Removed: " + queue.remove());

        // Check the size of the queue
        System.out.println("Queue size: " + queue.size());

        // Iterate over the queue
        for (String person : queue) {
            System.out.println(person);
        }
    }
}
