package com.example.challenge82;

public class ArrayOperations {

    private int[] numbers;

    //  When Inner Class is Non static.
    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
    }

    public class Statistics {
//        When Inner Class is static.
//        public Statistics(int[] numbers) {
//            ArrayOperations.numbers = numbers;
//        }

        public double mean() {
            double sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum / numbers.length;
        }

        double median() {
            return 0;
        }
    }

}
