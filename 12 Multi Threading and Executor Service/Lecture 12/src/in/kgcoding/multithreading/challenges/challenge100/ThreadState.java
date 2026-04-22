package in.kgcoding.multithreading.challenges.challenge100;

public class ThreadState extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("from inside run %s ", Thread.currentThread().getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
