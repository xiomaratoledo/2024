import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharArrayExample {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            char[] buffer = new char[1024];
            int charsRead;

            // Read characters into the buffer
            while ((charsRead = br.read(buffer)) != -1) {
                // Process the characters read
                processCharArray(buffer, charsRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processCharArray(char[] buffer, int charsRead) {
        // Process the characters read from the buffer
        System.out.print("Characters Read: ");
        for (int i = 0; i < charsRead; i++) {
            System.out.print(buffer[i]);
        }
        System.out.println();
    }
}
