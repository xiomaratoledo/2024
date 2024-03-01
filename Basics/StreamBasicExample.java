import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "orange");
        
        // Convert the list to a stream
        Stream<String> stream = myList.stream();
        
        // Perform operations on the stream
        stream
            .filter(s -> s.startsWith("a")) // Filter elements starting with 'a'
            .map(String::toUpperCase)       // Convert elements to uppercase
            .forEach(System.out::println);  // Print each element
    }
}
