package in.example.methodreferences;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingMethodInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 1, 4, 3);

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));

        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);

        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum using reduce is : " + newSum2);

        int newSum3 = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum using reduce is with method reference : " + newSum3);
    }
}
