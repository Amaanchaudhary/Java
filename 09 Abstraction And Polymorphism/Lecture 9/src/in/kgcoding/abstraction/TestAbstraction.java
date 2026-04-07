package in.kgcoding.abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
//        Vehicle vh = new Vehicle(2); //Abstact
        Car car = new Car();
        car.makeStartSound();
        car.commute();
    }
}
