package in.kgcoding.multithreading.challenges.challenge99;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Hello from thread %s\n", Thread.currentThread().getName());
        }
    }
}
