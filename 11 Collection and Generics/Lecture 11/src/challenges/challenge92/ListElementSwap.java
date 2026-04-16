package challenges.challenge92;

import java.util.Arrays;
import java.util.List;

public class ListElementSwap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 8);
        System.out.println(list);
        swap(list, 0, list.size() - 1);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int x, int y) {
        int temp = list.get(x);
        list.set(x, list.get(y));
        list.set(y, temp);
    }
}
