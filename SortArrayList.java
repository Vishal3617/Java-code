import java.util.*;
public class SortArrayList {
	 public static void main(String[] args) {
		    // Create an ArrayList of Strings
		    ArrayList<String> list = new ArrayList<>();
		    list.add("Amit");
		    list.add("Amin");
		    list.add("Jakir");

		    // Sort the ArrayList in ascending order
		    Collections.sort(list);

		    // Print the sorted ArrayList
		    for (String string : list) {
		      System.out.println(string);
		    }
		  }
		}
