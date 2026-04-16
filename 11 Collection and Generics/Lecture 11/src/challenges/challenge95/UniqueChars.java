package challenges.challenge95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChars {
    static void main() {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter you String : ");
        String str = input.next();

        for(char c : str.toCharArray()){
            unique.add(c);
        }

        System.out.printf("Unique char your string has %d unique chars",
                unique.size());



    }
}
