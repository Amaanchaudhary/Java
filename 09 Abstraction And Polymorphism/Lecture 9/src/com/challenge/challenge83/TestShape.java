package com.challenge.challenge83;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
