import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLinesExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            String line;

            while ((line = br.readLine()) != null) {
                // Process each line of text
                System.out.println("Line " + (++lineCount) + ": " + line);
            }

            System.out.println("\nTotal number of lines: " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
