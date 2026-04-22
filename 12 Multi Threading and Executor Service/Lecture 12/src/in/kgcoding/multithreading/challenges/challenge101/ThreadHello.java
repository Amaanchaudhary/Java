package in.kgcoding.multithreading.challenges.challenge101;

public class ThreadHello extends Thread {

    private final int threadNumber;

    public ThreadHello(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s Thread Starting %d\n",
                    Thread.currentThread().getName(), threadNumber);
            Thread.sleep(5000);
            System.out.printf("%s Thread Ended %d\n",
                    Thread.currentThread().getName(), threadNumber);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
