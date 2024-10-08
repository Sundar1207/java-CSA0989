import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs (keys are stored in sorted order)
        treeMap.put(3, "Orange");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        // Iterate over the TreeMap
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check the first and last keys
        System.out.println("First Key: " + ((TreeMap<Integer, String>) treeMap).firstKey());
        System.out.println("Last Key: " + ((TreeMap<Integer, String>) treeMap).lastKey());
    }
}
