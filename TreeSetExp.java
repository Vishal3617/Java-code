import java.util.TreeSet;

public class TreeSetExp {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add some numbers to the TreeSet
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(6);

        // Find numbers less than 7
        TreeSet<Integer> numbersLessThan7 = new TreeSet<>(treeSet.headSet(7));

        // Display the numbers less than 7
        System.out.println("Numbers less than 7 in the TreeSet: " + numbersLessThan7);
    }
}



