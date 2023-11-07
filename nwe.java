import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class nwe {
	 public static void main(String[] args) {
		 List<String> list = new ArrayList<>();
		 list.add("Java");
		 list.add("JavaScript");
		 list.add("Python");
		 
		 Iterator<String> iterator = list.iterator();
		 while (iterator.hasNext()) {
			 String string = iterator.next();
			 System.out.println(string);
		 }
	 }
}