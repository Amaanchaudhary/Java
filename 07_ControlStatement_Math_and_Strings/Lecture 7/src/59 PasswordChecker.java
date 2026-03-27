import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pass;
        do{
            System.out.println("Please Enter You Password");
            pass = input.next();
        }while(!isValidPassword(pass));
        System.out.println("Thank you for Entering Valid Password");
    }

    public static boolean isValidPassword(String pass){
        return pass.length() > 6;
    }
}
