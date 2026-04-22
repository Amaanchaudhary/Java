package in.kgcoding.multithreading.challenges.challenge102;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SignalThread redLight = new SignalThread(SignalLights.RED, 5000);
        SignalThread yellowLight = new SignalThread(SignalLights.YELLOW, 3000);
        SignalThread greenLight = new SignalThread(SignalLights.GREEN, 8000);
//
        greenLight.start();
        greenLight.join();
        yellowLight.start();
        yellowLight.join();
        redLight.start();
        redLight.join();
//        yellowLight.start(); // One Thread Can only be Run Once. Here we cant Run again.
//        yellowLight.join();
//        greenLight.start();
//        greenLight.join();

        System.out.println("FINISH");
    }
}
