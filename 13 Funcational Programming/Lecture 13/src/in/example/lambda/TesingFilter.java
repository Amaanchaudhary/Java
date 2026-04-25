package in.example.lambda;

import java.util.List;
import java.util.function.Consumer;

public class TesingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "banana", "kiwi", "grape");
        System.out.println("Printing from for loop");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Printing using Stream using Consumer");
        fruits.forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("Printing using Lambda");
        fruits.stream().forEach(fruit -> System.out.println(fruit));
        fruits.forEach(System.out::println);

        System.out.println("Printing using Filter using lambda");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
