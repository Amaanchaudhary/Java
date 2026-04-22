package in.kgcoding.multithreading.challenges.challenge102;

public class ExtendingMain {
    public static void main(String[] args) throws InterruptedException {
        runSignal(SignalLights.RED, 5000);
        runSignal(SignalLights.YELLOW, 3000);
        runSignal(SignalLights.GREEN, 8000);
        runSignal(SignalLights.YELLOW, 3000);
        runSignal(SignalLights.RED, 5000);
    }

    public static void runSignal(SignalLights signal, int signalTime) throws InterruptedException {
        SignalThread thread = new SignalThread(signal, signalTime);
        thread.start();
        thread.join();
    }
}
