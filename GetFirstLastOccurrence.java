import java.util.LinkedList;

public class GetFirstLastOccurrence {

  public static void main(String[] args) {
    // Create a linked list
    LinkedList<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");

    // Get the first occurrence of the letter "a"
    int firstOccurrence = list.indexOf("a");

    // Get the last occurrence of the letter "a"
    int lastOccurrence = list.lastIndexOf("a");

    System.out.println("The first occurrence of the letter 'a' is at index " + firstOccurrence);
    System.out.println("The last occurrence of the letter 'a' is at index " + lastOccurrence);
  }
}