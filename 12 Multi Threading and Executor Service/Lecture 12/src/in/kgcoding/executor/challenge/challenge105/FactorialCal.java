package in.kgcoding.executor.challenge.challenge105;

import java.util.concurrent.Callable;

public class FactorialCal implements Callable<Integer> {

    private final int number;

    FactorialCal(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public Integer call() throws Exception {
//        System.out.printf("%s Thread Started Calculing Fac of %d\n",
//                Thread.currentThread().getName(), number);
        Thread.sleep(2000);
        int fac = 1;
        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
//        System.out.printf("%s Thread Task Completed\n",
//                Thread.currentThread().getName());
        return fac;
    }
}
