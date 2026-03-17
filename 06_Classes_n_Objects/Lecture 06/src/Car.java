public class Car {

    static int noOfCarSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static {  //static block load before constructor when first time jvm see class name in whole program..
        noOfCarSold = 0;
        System.out.println("I am Static block");
    }
    { // Initialization block load on each obj creation before constructor
        noOfCarSold++;
        System.out.println("I am init block");
    }

    Car(){
//        this.color = "black";
//        noOfWheels = 4;
//        maxSpeed = 150;
//        currentFuelInLiters = 2;
//        noOfSeats = 5;
        this("black");
        currentFuelInLiters = 5; // if someone call default, he'll get 5 ltr.
    }

    Car(String color){
        this.color = color;
        noOfWheels = 4;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    public Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is Out of Fuel, Cannot Start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in Reserve Mode, please refuel");
        } else {
            System.out.println("Car is Driving, Bhroom..");
        }

        return this; // this can be used to know for which instance i am currennt working for
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is Driving");
    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters; //if confusion "this" means current obj
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}