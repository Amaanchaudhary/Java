import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend for Divide: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor to Divide: ");
        int divisor = sc.nextInt();
        try {
            int result = dividend / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
