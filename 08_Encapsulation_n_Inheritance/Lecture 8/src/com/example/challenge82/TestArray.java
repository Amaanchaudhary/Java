package com.example.challenge82;

public class TestArray {
    public static void main(String[] args) {
//        if Nested Class is not Static
        ArrayOperations opr = new ArrayOperations(new int[]{1, 2, 3, 4, 5});
        ArrayOperations.Statistics stats = opr.new Statistics();
        System.out.println(stats.mean());

        // If Nested Class is Static
//        ArrayOperations.Statistics stats = new ArrayOperations.Statistics(new int[]{1,2,3,4,5});
//        System.out.println(stats.mean());
    }
}
