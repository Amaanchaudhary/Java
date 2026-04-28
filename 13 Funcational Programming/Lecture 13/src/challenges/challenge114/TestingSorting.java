package challenges.challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Amaan", 1000),
                new Employee("Rohan", 900),
                new Employee("Maaz", 700),
                new Employee("Abdul", 1100),
                new Employee("Hero", 60)
        );

        employees.stream()
                .sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
                .forEach(System.out::println);
    }
}
