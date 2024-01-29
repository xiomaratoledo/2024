import java.io.*;

public class FileInputStreamBulkReadExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            byte[] buffer = new byte[10]; // Read up to 10 bytes at a time

            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                // Process the bytes read
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print((char) buffer[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
