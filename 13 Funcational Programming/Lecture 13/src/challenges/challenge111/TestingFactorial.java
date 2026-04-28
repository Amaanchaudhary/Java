package challenges.challenge111;

import java.util.stream.IntStream;

public class TestingFactorial {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial using procedural and functoonal programg ");
        System.out.println(factorial(number));

        IntStream.rangeClosed(2, number)
                .reduce((x, y) -> x * y)
                .ifPresent(System.out::println);
    }

    public static long factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
