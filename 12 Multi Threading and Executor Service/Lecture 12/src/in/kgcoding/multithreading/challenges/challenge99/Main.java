package in.kgcoding.multithreading.challenges.challenge99;

public class Main {
    public static void main(String[] args) {
//        Way 1
//        Thread1 t1 = new Thread1();
//        Thread2 t2 = new Thread2();
//
//        t1.start();
//        t2.start();

//        Way 2
        HelloThread ht1 = new HelloThread(1);
        HelloThread ht2 = new HelloThread(2);

        ht1.start();
        ht2.start();

    }
}
