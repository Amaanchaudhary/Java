package in.kgcoding.multithreading;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\nStar Task Completed");

        for (int i = 1; i <= 10000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\nDollar Task Completed");

        for (int i = 1; i <= 10000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\nHash Task Completed");
        long end = System.currentTimeMillis();
        System.out.printf("total time taken %d ms", (end - start));
    }
}