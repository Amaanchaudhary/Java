package com.example.challenge81;

import java.util.Objects;

public class Person {
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person(21, "Amaan");
        Person p2 = new Person(21, "Aman");

        if(p1.equals(p2)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
