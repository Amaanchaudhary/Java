package in.kgcoding.multithreading.thread;

public class ExtendingNeedOfMultiThreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("Starting First Task\n");
        t1.start();
        System.out.println("Starting Second Task\n");
        t2.start();
        System.out.println("Starting Third Task\n");
        t3.start();

        long end = System.currentTimeMillis();
        System.out.printf("%s total time taken %d ms\n",
                Thread.currentThread().getName(), (end - start));
    }
}