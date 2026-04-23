package in.kgcoding.executor.challenge.challenge104;

public class Prints implements Runnable {
    @Override
    public void run() {
        try {
            Thread current = Thread.currentThread();
            System.out.printf("\n%s Thread Started",
                    Thread.currentThread().getName());
            Thread.sleep(generateRandom() * 1000L);
            System.out.printf("\n%s Thread Ended",
                    Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int generateRandom() {
        double random = Math.random() * 5 + 1;
        return (int) random;
    }
}
