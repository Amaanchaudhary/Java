package collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("AMAAN");
        strList.add("Hi");
        strList.add(1, "Daniel");
        strList.remove(1);
        strList.set(1, "hello");

        if (strList.contains("AMAAN")) {
            System.out.println(strList.indexOf("AMAAN"));
        }

        System.out.println(strList.get(0));
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        for (String s : strList) {
            System.out.println(s);
        }
    }
}
