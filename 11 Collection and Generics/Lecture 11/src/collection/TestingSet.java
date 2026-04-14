package collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        System.out.println(names.add("Amaan"));
        System.out.println(names.add("is"));
        System.out.println(names.add("Hero"));
        Utility.print(names);

        System.out.println(names.add("Amaan"));
        System.out.println(names.size());
        System.out.println(names.contains("Amaan"));
        System.out.println(names.remove("Hero"));
    }
}
