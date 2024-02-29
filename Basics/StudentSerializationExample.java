package IO;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentSerializationExample {
    public static void main(String[] args) {
        Student num1 = new Student("Hatsune Miku", 18);
        try {
            FileOutputStream fileOut = new FileOutputStream("Student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(num1);
            fileOut.close();
            out.close();
            System.out.println("Student object serialize successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

