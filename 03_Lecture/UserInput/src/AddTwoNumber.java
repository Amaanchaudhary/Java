import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Please Enter the Number 2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of Both Number is : " + sum);
    }
}
