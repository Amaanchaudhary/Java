import java.util.Scanner;

class ReadInputAndBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        do{
            System.out.print("Please Enter the String : ");
            str = input.next();
        }while(!str.equals("break"));
        System.out.println("Program Exited, You Enter Break!");
    }
}
