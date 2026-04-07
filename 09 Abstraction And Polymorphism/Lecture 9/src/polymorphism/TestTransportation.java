package polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();

        Vehicle v2 = new Car();
        Car cv = new Vehicle();
    }
}
