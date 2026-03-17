import javax.smartcardio.Card;

public class Driver {

    static int minAgeForDriver = 18;
    String name;
    int age;
    String dateOfLicence;

    public boolean isAllowedToDrive(){
        return this.age >= minAgeForDriver;
    }

    public static void main(String[] args){
//        Car myCar; // just created instance to store reference of object
//        myCar = new Car(); // now with the help of constructor, created the object and return the
        // address of the newly created object and assign it to Car class variable
        // new -> dynamic memory allocation returns the address/ref of newly created obj.

//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car("red");
        Car thar = new Car();
//        swift.addFuel(6);
//        Car startedCar = swift.start();
        swift.start().drive();
        System.out.println(swift.color);
//        Driver myDriver = new Driver();
//        myDriver.dateOfLicence = "01/02/22";
//        System.out.println(minAgeForDriver);
    }
}
