package in.kgcoding.executor.challenge.challenge103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        PrintNumbers task1 = new PrintNumbers(10);

        service.submit(task1);

        service.shutdown();
    }
}
