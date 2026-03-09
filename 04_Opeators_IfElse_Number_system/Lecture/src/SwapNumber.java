import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number 1 to swap : ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Number 2 to swap : ");
        int num2 = input.nextInt();
        int c = num1;
        num1 = num2;
        num2 = c;
        System.out.println("After Swap, \n Value of Num1 is " + num1 + "\n Value of Num2 is " + num2  );
    }
}