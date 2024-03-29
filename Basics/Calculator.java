import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        try {
            double average = calculateAverage(fileName);
            System.out.println("Average: " + average);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static double calculateAverage(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            double sum = 0;
            int count = 0;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                sum += number;
                count++;
            }
            if (count == 0) {
                throw new IOException("Empty file: " + fileName);
            }
            return sum / count;
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
