import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<String> myList = new ArrayList<>();

        // Adding elements
        myList.add("Java");
        myList.add("Python");
        myList.add("C++");

        // Accessing elements
        System.out.println("Element at index 1: " + myList.get(1));

        // Iterating through the list
        System.out.println("List elements:");
        for (String element : myList) {
            System.out.println(element);
        }

        // Removing an element
        myList.remove("Python");

        // Size after removal
        System.out.println("Size after removal: " + myList.size());
    }
}
