public class Recursion {
    public static void main(String[] args) {
        System.out.println(
//                factorialIterative(5));
                factorialRecursion(5));
    }


    public static long factorialIterative(int num) {
        int i = 2;
        int fac = 1;
        while (i <= num) {
            fac *= i;
            i++;
        }
        return fac;
    }

    public static long factorialRecursion(int num) {
        if(num == 1) return 1;
        return num * factorialRecursion(num - 1);
    }
}
