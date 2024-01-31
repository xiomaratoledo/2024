/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

/**
 *
 * @author pc
public class FileReaderExample {
 */
import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

