package challenges.challenge91;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 8);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 7));
    }
}
