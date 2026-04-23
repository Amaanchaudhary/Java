package in.kgcoding.executor.future;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        FetchName task1 = new FetchName("Amaan");
        FetchName task2 = new FetchName("Rocky");
        FetchName task3 = new FetchName("Rohan");
        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);

        System.out.printf("\nFull name is " + name1.get());
        System.out.printf("\nFull name is " + name2.get());
        System.out.printf("\nFull name is " + name3.get());

        service.shutdown();
    }
}
