package in.example.lambda.challenges.challenge107;

import java.util.Arrays;
import java.util.List;

public class PrintStringConsole {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange");
//        List<String> fruits2 = List.of("apple", "banana", "orange");

        fruits.stream().forEach(System.out::println);
    }
}
