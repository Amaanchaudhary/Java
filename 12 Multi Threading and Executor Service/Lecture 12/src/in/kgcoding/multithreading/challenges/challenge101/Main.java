package in.kgcoding.multithreading.challenges.challenge101;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadHello t1 = new ThreadHello(1);
        ThreadHello t2 = new ThreadHello(2);
        ThreadHello t3 = new ThreadHello(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
