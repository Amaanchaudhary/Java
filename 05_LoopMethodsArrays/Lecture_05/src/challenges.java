import java.util.Arrays;

public class challenges {
    public static void main(String[] args) {
//        System.out.println(oddSum(10));
//        System.out.println(factorial(1));
//        System.out.println(sumOfDigits(234));
//        System.out.println(lcm(15, 20));
        System.out.println(gcd(7, 5));
    }

    public static int oddSum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }

    public static long factorial(int num) {
        int i = 2;
        int fac = 1;
        while (num > 1 && i <= num) {
            fac *= i;
            i++;
        }
        return fac;
    }

    public static long sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  // Returns Last Digit  eg :- 236 % 10 = 6   //Remainder
            num /= 10;     // Remove the Last Digit eg :- 236 / 10 = 23  //Divide
        }
        return sum;
    }

    public static long lcm(int num1, int num2) {
        int i = 1;
        while (i <= num2) {
            int factor = i * num1;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
        return 0;
    }

    public static long gcd(int num1, int num2) {
        int gcd = 1;
        int i = Math.min(num1, num2);

        while (i > 0) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
            i--;
        }
        return gcd;
    }
}
