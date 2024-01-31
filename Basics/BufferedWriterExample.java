import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            String line = "This is a line of text.";
            bw.write(line);
            bw.newLine();  // Adds a new line
            bw.write("Another line of text.");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
