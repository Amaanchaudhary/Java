package in.kgcoding.executor.challenge.challenge105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class TestFactorial {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);

        List<Future<Integer>> results = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            FactorialCal task = new FactorialCal(i);
            results.add(service.submit(task));
        }

        for (Future<Integer> result : results) {
            System.out.printf("\nFac is %d\n", result.get());
        }

//        FactorialCal task1 = new FactorialCal(5);
//        FactorialCal task2 = new FactorialCal(6);
//        FactorialCal task3 = new FactorialCal(7);
//        FactorialCal task4 = new FactorialCal(8);
//        FactorialCal task5 = new FactorialCal(9);
//
//        Future<Integer> facOf5 = service.submit(task1);
//        Future<Integer> facOf6 = service.submit(task2);
//        Future<Integer> facOf7 = service.submit(task3);
//        Future<Integer> facOf8 = service.submit(task4);
//        Future<Integer> facOf9 = service.submit(task5);

//        System.out.printf("\nFac of %d is %d ", task1.getNumber(), facOf5.get());
//        System.out.printf("\nFac of %d is %d ", task2.getNumber(), facOf6.get());
//        System.out.printf("\nFac of %d is %d ", task3.getNumber(), facOf7.get());
//        System.out.printf("\nFac of %d is %d ", task4.getNumber(), facOf8.get());
//        System.out.printf("\nFac of %d is %d ", task5.getNumber(), facOf9.get());

        service.shutdown();

        if (!service.awaitTermination(5, TimeUnit.SECONDS)) {
            System.out.printf("Service terminated abnormally\n");
            service.shutdownNow();
        }
    }
}
