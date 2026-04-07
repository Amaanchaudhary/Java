package com.challenge.challenge84;

public class Eagle extends Bird {

    public Eagle(){
        super("Australian");
    }

    @Override
    public void fly() {
        System.out.println("Eagle flying");
    }
}
