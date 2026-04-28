package in.example.optional;

import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 1, 4, 3);

        Optional<Integer> sum = numbers.stream()
                .reduce((x, y) -> x + y);

        if (sum.isPresent()) {
            System.out.println(sum.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
