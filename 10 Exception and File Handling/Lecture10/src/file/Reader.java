package Lecture10.src.file;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    static void main() {
        String fileName = "java-course.txt";
        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char) read);
            } while (read != -1);
        } catch (IOException e) {
            System.out.printf("Exception Occurred %s\n", e.getMessage());
        }
    }
}
