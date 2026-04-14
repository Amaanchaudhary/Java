package collection;

import java.util.Collection;

public class Utility {
    public static <E> void print(Collection<E> collection) {
        System.out.print("collection is : ");
        for (E o : collection) {
            System.out.printf("%s ", o);
        }
        System.out.println();
    }
}
