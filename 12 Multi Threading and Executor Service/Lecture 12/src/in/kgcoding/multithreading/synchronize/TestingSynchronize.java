package in.kgcoding.multithreading.synchronize;

public class TestingSynchronize {
    private static long end;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Counter counter = new Counter();

        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);
        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println("Thread Interrupted" + e.getMessage());
        }
        long end = System.currentTimeMillis();

        System.out.printf("Final Counter Value : %d and time taken %d \n",
                counter.getCounter(), (end - start));
    }
}
