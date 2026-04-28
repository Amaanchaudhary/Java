package challenges.challenge113;

import java.util.List;
import java.util.stream.Collectors;

public class TestingIntermediateDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1, 6, 7, 8, 9);
        List<Integer> uniques = numbers.stream()
                .distinct()
//                .toList(); //same
                .collect(Collectors.toList());

        System.out.println(uniques);

    }
}
