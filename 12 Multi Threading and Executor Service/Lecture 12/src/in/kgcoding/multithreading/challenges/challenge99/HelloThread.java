package in.kgcoding.multithreading.challenges.challenge99;

public class HelloThread extends Thread {
    private final int threadNo;

    HelloThread(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Hello from thread %d\n", threadNo);
        }
    }
}
