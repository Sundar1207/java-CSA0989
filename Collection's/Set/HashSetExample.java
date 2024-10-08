import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");  // Duplicate will not be added

        // Check if element exists
        System.out.println("Contains Apple? " + set.contains("Apple"));

        // Remove an element
        set.remove("Banana");

        // Iterate through the HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Size of the HashSet
        System.out.println("Size of HashSet: " + set.size());

        // Clear the HashSet
        set.clear();
        System.out.println("Is HashSet empty? " + set.isEmpty());
    }
}
