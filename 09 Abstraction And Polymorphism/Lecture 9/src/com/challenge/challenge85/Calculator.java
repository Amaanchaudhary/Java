package com.challenge.challenge85;

public class Calculator {
    private static int add(int a, int b){
        return a + b;
    }

    private static int add(int a, int b, int c){
        return a + b + c;
    }

    private static double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2,3));
        System.out.println(add(2,3));
        System.out.println(add(2.0,3.0));
    }
}
