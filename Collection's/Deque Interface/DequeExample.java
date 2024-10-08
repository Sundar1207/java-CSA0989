import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the front and back
        deque.addFirst("John");
        deque.addLast("Jane");
        deque.addLast("Tom");

        // Peek at the front and back of the deque
        System.out.println("Front of deque: " + deque.peekFirst());
        System.out.println("Back of deque: " + deque.peekLast());

        // Remove from the front and back
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from back: " + deque.removeLast());

        // Check size
        System.out.println("Deque size: " + deque.size());

        // Iterate over the deque
        for (String person : deque) {
            System.out.println(person);
        }
    }
}
