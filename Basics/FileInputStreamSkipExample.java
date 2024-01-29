import java.io.*;

public class FileInputStreamSkipExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            // Skip the first 5 bytes
            long bytesToSkip = 5;
            long bytesSkipped = fis.skip(bytesToSkip);

            System.out.println("Skipped " + bytesSkipped + " bytes.");

            // Read and print the remaining content
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
