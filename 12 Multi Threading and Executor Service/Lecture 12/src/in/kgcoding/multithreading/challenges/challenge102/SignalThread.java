package in.kgcoding.multithreading.challenges.challenge102;

public class SignalThread extends Thread {
    private final SignalLights signal;
    private final int signalTime;

    public SignalThread(SignalLights signal, int signalTime) {
        this.signal = signal;
        this.signalTime = signalTime;
    }

    @Override
    public void run() {
        try {
            System.out.printf("Signal %s: Started\n", signal);
            int seconds = signalTime / 1000;
            while (seconds > 0) {
                switch (signal) {
                    case RED:
                        System.out.printf("STOP %d\n", seconds);
                        break;
                    case YELLOW:
                        System.out.printf("SLOW DOWN %d\n", seconds);
                        break;
                    case GREEN:
                        System.out.printf("GO %d\n", seconds);
                        break;
                }
                Thread.sleep(1000);
                seconds--;
            }
            System.out.printf("Signal %s: Ended\n", signal);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
