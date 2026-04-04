package com.example.challenge80;

public class TestItems {
    public static void main(String[] args) {
        Dvd d1 = new Dvd(10, "001", "Tere Naam", "Salman");
        Magazine m1 = new Magazine(900, "002", "Rich Kid", "John");
        Book b1 = new Book("123", "003", "Poor", "Doe");

        LibraryItem l1 = new Dvd(20, "004", "Guns", "Robin");

        System.out.println(d1.duration);
        System.out.println(l1.title); //no duration as ref is of parent obj no child property knowns.

        m1.checkout();
        l1.checkout();
    }
}
