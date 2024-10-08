import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        // Create a Deque using LinkedList
        Deque<String> deque = new LinkedList<>();

        // Add elements to both ends
        deque.addFirst("Front");
        deque.addLast("Back");

        // Peek at the front and back
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // Remove elements from both ends
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque is empty? " + deque.isEmpty());
    }
}
