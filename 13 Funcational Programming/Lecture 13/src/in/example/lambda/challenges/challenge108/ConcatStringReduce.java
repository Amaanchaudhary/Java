package in.example.lambda.challenges.challenge108;

import java.util.List;

public class ConcatStringReduce {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "Pomegranate", "banana", "orange",
                "Pineapples", "grapefruit", "cherry", "lemon chic");

        String result = fruits.stream()
                .filter(s -> s.length() >= 10)
                .reduce("", (s1, s2) -> s1 + s2);

        System.out.println(result);

    }
}
