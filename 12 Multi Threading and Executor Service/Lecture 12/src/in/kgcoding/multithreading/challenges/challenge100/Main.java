package in.kgcoding.multithreading.challenges.challenge100;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadState t1 = new ThreadState();
        System.out.printf("Creating the thread %s ", t1.getState());

        t1.start();
        t1.join(); // Start Run method sleep for 4 sec so waiting until its completed.

        System.out.printf("Thread Finished %s ", t1.getState());
    }
}
