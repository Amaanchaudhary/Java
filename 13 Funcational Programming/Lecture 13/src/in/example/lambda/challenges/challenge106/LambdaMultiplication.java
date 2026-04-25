package in.example.lambda.challenges.challenge106;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> product = (a, b) -> a * b;

        System.out.println(product.apply(1, 2));
        System.out.println(product.apply(3, 4));
    }
}
