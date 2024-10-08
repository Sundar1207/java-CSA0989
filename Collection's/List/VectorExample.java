import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add(1, "Orange"); // Adding at index 1
        System.out.println("Vector: " + vector);

        // Accessing elements
        System.out.println("Element at index 1: " + vector.get(1));
        System.out.println("First Element: " + vector.firstElement());
        System.out.println("Last Element: " + vector.lastElement());

        // Checking if it contains a specific element
        System.out.println("Does the vector contain 'Banana'? " + vector.contains("Banana"));

        // Size of the Vector
        System.out.println("Size of Vector: " + vector.size());

        // Remove element at index 0
        vector.remove(0);
        System.out.println("After removal: " + vector);

        // Checking if the Vector is empty
        System.out.println("Is the Vector empty? " + vector.isEmpty());

        // Clearing all elements
        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}
