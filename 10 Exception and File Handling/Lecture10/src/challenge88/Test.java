package Lecture10.src.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename you want to read the content : ");
        String fileName = sc.next();
        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException e) {
            System.out.printf("%s Not Found", fileName);
        } catch (IOException e) {
            System.out.printf("Exception Occurred %s ", e.getMessage());
        }
    }
}
