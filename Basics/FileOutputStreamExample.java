
package IO;

import java.io.IOException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String file = "example.txt";
        
        try {
            FileOutputStream fos = new FileOutputStream(file);
            byte[] data = "Hello, FileOutputStream!".getBytes();
            for (byte b : data) {
                System.out.print((char)b);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}





