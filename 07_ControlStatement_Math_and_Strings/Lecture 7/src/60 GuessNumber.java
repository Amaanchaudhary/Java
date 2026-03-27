import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
        int number = getRandomNumber();
        Scanner input = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Guess the Number");
            guess = input.nextInt();
        } while (number != guess);
        System.out.println("You Win!");
    }

    public static int getRandomNumber() {
        return (int) Math.floor(Math.random() * 10) + 1;
    }
}
