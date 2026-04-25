package in.example.lambda;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 1, 4, 3);
        int sum = 0;
        for (Integer integer : numbers) {
            sum += integer;
        }
        System.out.println("Sum using loop is : " + sum);

        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.println("Sum using reduce is : " + newSum);

        int newSum2 = numbers.stream()
//                .reduce(0, Integer::sum);
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum using reduce is : " + newSum2);

        int maximum = numbers.stream()
                .reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("finding Maximum using reduce is : " + maximum);
    }
}
