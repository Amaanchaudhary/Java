package in.kgcoding.executor.challenge.challenge103;

public class PrintNumbers implements Runnable {

    private final int number;

    public PrintNumbers(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.printf("\nTask %s Started printing number till %d",
                Thread.currentThread().getName(), number);
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d ", i);
        }
        System.out.printf("\n%s Task Completed\n",
                Thread.currentThread().getName());
    }
}
