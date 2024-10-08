import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Print elements (in insertion order)
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Remove an element
        set.remove("Banana");

        // Check size
        System.out.println("Size of LinkedHashSet: " + set.size());
    }
}
