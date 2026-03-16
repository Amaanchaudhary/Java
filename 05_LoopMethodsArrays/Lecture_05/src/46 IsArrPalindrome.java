import java.util.Scanner;

class IsArrPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Check Is Array Palindrome or not.");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println(checkArrayPalindrome(numArray));
    }

    public static boolean checkArrayPalindrome(int[] arr){
        int i = 0;
        int arrSize = arr.length;
        while(i < arrSize / 2){
            if(arr[i] != arr[arrSize - i - 1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
