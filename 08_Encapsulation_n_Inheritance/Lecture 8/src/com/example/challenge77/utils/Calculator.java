package com.example.challenge77.utils;

import com.example.challenge77.geometry.Circle;
import com.example.challenge77.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(3);
        Rectangle rec = new Rectangle(2, 4);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double recArea = rec.length * rec.breadth;

        System.out.println(cirArea);
        System.out.println(recArea);
    }
}
