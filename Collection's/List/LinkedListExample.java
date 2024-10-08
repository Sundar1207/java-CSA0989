import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.addFirst("A"); // Adds to the start
        linkedList.addLast("Z");  // Adds to the end
        System.out.println("LinkedList: " + linkedList);

        // Accessing first and last elements
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());

        // Checking if the list contains a specific element
        System.out.println("Does the list contain 'Y'? " + linkedList.contains("Y"));

        // Removing elements from the list
        linkedList.removeFirst(); // Removes A
        linkedList.removeLast();  // Removes Z
        System.out.println("After removals: " + linkedList);

        // Polling elements (retrieves and removes the head)
        linkedList.poll();
        System.out.println("After polling: " + linkedList);

        // Offering (inserting) elements at both ends
        linkedList.offerFirst("P");
        linkedList.offerLast("Q");
        System.out.println("After offerFirst and offerLast: " + linkedList);

        // Size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing: " + linkedList);
    }
}
