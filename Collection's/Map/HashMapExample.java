import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        // Retrieve a value by its key
        System.out.println("Value for key 2: " + map.get(2));

        // Iterate over the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check if a key or value exists
        System.out.println("Map contains key 1: " + map.containsKey(1));
        System.out.println("Map contains value 'Banana': " + map.containsValue("Banana"));

        // Remove an element by its key
        map.remove(1);
    }
}
