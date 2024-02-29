package IO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class StudentDeserializationExample {
    public static void main(String[] args) {
        // Deserialize a Student object
        Student loadedStudent = null;
        try {
            FileInputStream fileIn = new FileInputStream("Student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            loadedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Student object deserialization successfully");
            
            // Print the details of the loaded Student object 
            System.out.println("Name: " + loadedStudent.getName());
            System.out.println("Age: " + loadedStudent.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
