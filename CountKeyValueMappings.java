import java.util.HashMap;
import java.util.Map;

public class CountKeyValueMappings {

  public static void main(String[] args) {
    // Create a HashMap object
    Map<String, String> map = new HashMap<>();

    // Add key-value pairs to the HashMap
    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");

    // Get the size of the HashMap
    int size = map.size();

    System.out.println("The size of the HashMap is: " + size);
  }
}