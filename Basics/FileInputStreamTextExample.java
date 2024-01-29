import java.io.*;

public class FileInputStreamTextExample {
    public static void main(String[] args) {
        // Specify the path of the text file
        String filePath = "example.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Display information about the file
            System.out.println("File Information:");
            System.out.println("File Name: " + filePath);
            System.out.println("File Size: " + fis.available() + " bytes");

            // Read and display the content of the text file
            System.out.println("\nFile Content:");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
