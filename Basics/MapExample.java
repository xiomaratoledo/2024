import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        // Convert each word to uppercase using map
        List<String> uppercaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        // Print the resulting list
        System.out.println("Uppercase words: " + uppercaseWords);
    }
}
