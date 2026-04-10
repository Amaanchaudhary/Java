package superexample;

class Car extends Vehicle {

    Car(){
        super();
    }

    Car(int noOfTires) {
        super(noOfTires);
    }

    public int noOfDoors(){
        return 5;
    }

    public void start(){
        System.out.println(getNoOfTires());
        System.out.println("Car starting");
    }
}
