import java.util.Scanner;

public class ProductOfFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Number1 for product : ");
        float float1 = input.nextFloat();
        System.out.print("Please Enter Number2 to product : ");
        float float2 = input.nextFloat();
        float product = float1 * float2;
        System.out.println("Product is " + product);
    }
}
