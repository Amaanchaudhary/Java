package superexample;

public abstract class Vehicle {
    private int noOfTires;

    Vehicle() {
        this.noOfTires = 0;
    }

    Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return this.noOfTires;
    }

    public abstract void start();
}
