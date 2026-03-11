import java.util.Arrays;

public class challenges {
    public static void main(String[] args) {
//        System.out.println(oddSum(10));
//        System.out.println(factorial(1));
//        System.out.println(sumOfDigits(234));
//        System.out.println(lcm(15, 20));
//        System.out.println(gcd(7, 5));
//        System.out.println(isPrime(9));
//        System.out.println(reverseNumber(100));
//        printFibonacci(1);
        System.out.println(isArmStrong(154));
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

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int reverseNumber(int num) {
        int result = 0;
        while (num > 0) {
            int lastDigit = num % 10; //Extract Last Digit of Number
            result *= 10; // Shift result one digit left 0 -> 10
            result += lastDigit; // Add Last Digit into result
            num /= 10; // Remove Last digit from number
        }
        return result;
    }

    public static void printFibonacci(int num) {
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }

    public static boolean isArmStrong(int num) {
        int count = countDigit(num);
        int numCopy = num;
        int result = 0;

        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            result += (int) Math.pow(digit, count);
        }
        return result == numCopy;
    }

    public static int countDigit(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
