import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Please Enter You Name"); // Take input in new line
        System.out.print("Please Enter You Name : "); //in Same line
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print("Also Tell me you Age : ");
        int Age = input.nextInt();
        System.out.println("Your Age is "+ Age);
    }
}