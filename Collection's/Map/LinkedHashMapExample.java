import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        Map<Integer, String> linkedMap = new LinkedHashMap<>();

        // Add key-value pairs (insertion order is maintained)
        linkedMap.put(1, "Apple");
        linkedMap.put(3, "Orange");
        linkedMap.put(2, "Banana");

        // Iterate over the LinkedHashMap
        for (Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get a value
        System.out.println("Value for key 2: " + linkedMap.get(2));
    }
}
