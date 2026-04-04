package in.kgcoding.inheritence;

public class Vehicle {
    public int noOfTyres;

    public void commute(){
        System.out.printf("I am Going from place A to place B using %d tyres", noOfTyres);
    }

    @Override
    public String toString() {
        return "This is Vehicle Class " + noOfTyres;
    }

    public static void main(String[] args) {
        Vehicle vh = new Vehicle();
        System.out.println(vh);
    }
}
