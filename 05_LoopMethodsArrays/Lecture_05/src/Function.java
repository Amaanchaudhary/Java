import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        greet("Amaan");
        printForwardIncrementPattern(5);
        int number1 = readNumber();
        int number2 = readNumber();
        System.out.println("Sum of Numbers is : " + sum(number1, number2));
    }

    public static void greet(String name) {
        System.out.println("Good Morning " + name);
    }

    public static void printForwardIncrementPattern(int lines) {
        int i = 0;
        while (i < lines) {
            for (int j = 0; j <= i; j++) {
                printStar();
            }
            System.out.println();
            i++;
        }
    }

    public static void printStar() {
        System.out.print("* ");
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number : ");
        return input.nextInt();
    }
}
