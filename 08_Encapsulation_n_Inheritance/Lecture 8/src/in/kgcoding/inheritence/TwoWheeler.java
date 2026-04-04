package in.kgcoding.inheritence;

import in.kgcoding.MotorCycle;

public class TwoWheeler extends Vehicle {

    protected TwoWheeler() {  // Same as Default + Children Access within or outside same package.
        noOfTyres = 2;
    }

    public void balance(){
        System.out.println("balancing on two tires");
    }

    public static void main(String[] args) {
        Vehicle vh = new Vehicle();
        TwoWheeler tw = new TwoWheeler();
        MotorCycle mc = new MotorCycle();
        System.out.println(vh);
        System.out.println(tw);
        System.out.println(mc);
    }
}
