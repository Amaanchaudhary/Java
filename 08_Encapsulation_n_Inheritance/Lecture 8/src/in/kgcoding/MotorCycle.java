package in.kgcoding;

import in.kgcoding.inheritence.TwoWheeler;

public class MotorCycle extends TwoWheeler {
    public static void main(String[] args) {
        MotorCycle mtc = new MotorCycle();
        mtc.balance();
        System.out.println(mtc.noOfTyres);
        mtc.commute();
    }
}
