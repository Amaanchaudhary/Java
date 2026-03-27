import java.util.Scanner;

class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Welcome to check Number Prime or not");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(isPrime(num));
    }

    public static boolean isPrime(int number){
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
