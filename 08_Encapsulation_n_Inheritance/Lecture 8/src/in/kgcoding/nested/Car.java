package in.kgcoding.nested;

public class Car {

    private int noOfDoors;

    public void repair(){
        Tyre t = new Tyre();

    }

    private class Tyre {
        private double width;
        private double pressure;
        private String material;

        private void inflate(){
            noOfDoors = 4;
        }
    }
}
