package Lecture10.src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static void a() {
        b();
    }

    private static void b() {
        c();
    }

    private static void c() {
        d();
    }

    private static void d() throws ArrayIndexOutOfBoundsException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Dividend for Divide: ");
        int dividend = sc.nextInt();
        System.out.print("Enter Divisor to Divide: ");
        int divisor = sc.nextInt();
        try {
            int[] arr = new int[5];
            arr[6] = dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
        } catch (Throwable th) {
            System.out.println("General Exception");
            throw th;
        }
    }

}
