package in.kgcoding.executor.future;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {

    private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\nFetching from server full name of " + name);
        Thread.sleep(1000);
        return name + "Bhartiya";
    }
}
