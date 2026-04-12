package Lecture10.src.file;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    static void main() {
        String fileName = "java-course.txt";
        // Try with resource syntax, No need for finally block to close the object,
        // java take the responsibility
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is best java course");
            writer.flush();
            System.out.println("File Written Success");
        } catch (IOException e) {
            System.out.printf("Exception Occurred %s\n", e.getMessage());
        }
    }
}
