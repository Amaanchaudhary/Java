package in.kgcoding.executor.challenge.challenge104;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutePrintTask {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            Prints task = new Prints();
            service.submit(task);
        }
        service.shutdown();
        System.out.println("\nSHUTDOWN");

        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("\nEMERGENCY SHUTDOWN");
            service.shutdownNow();
        }
    }
}
