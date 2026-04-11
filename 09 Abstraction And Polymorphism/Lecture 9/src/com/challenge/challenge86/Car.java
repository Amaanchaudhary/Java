package com.challenge.challenge86;

public class Car extends Vehicle{

    @Override
    public void service() {
        super.service();
        System.out.println("Car service");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.service();
    }
}
