package polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Plane p = new Plane();

//        c.start();
//        p.start();


        castTest(c);
        castTest(p);

//        Vehicle v2 = new Car();
//        Car cv = (Car) new Vehicle();  // Error

//        Object o = new Car();  // Object is the super class so any class can be ref to Object class.
    }

    private static void castTest(Vehicle v) {
        v.start();
//        Car cVeh = (Car) v;
//        ((Car) v).noOfDoors();
//        cVeh.start();
//        cVeh.noOfDoors();
    }
}
