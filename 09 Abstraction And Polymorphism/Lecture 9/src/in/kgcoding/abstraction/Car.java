package in.kgcoding.abstraction;

public class Car extends Vehicle{

    private int noOfDoors;

    @Override
    public void makeStartSound(){
        System.out.println("Vroom...!");
    }

    public Car(){
        super(4);
    }



}
