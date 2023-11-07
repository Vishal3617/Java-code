import java.util.HashMap;
import java.util.Map;

public class MapSize {
    public static void main(String[] args) {
        // Create a Map (e.g., a HashMap)
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("Five", 5);

        // Count the number of key-value mappings
        int size = map.size();

        // Display the result
        System.out.println("Number of key-value mappings in the map: " + size);
    }
}
