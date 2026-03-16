import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reverse Array.");
        int[] numArray = ArrayUtility.inputArray();
        System.out.println("Here's your Reversed Array");
        ArrayUtility.displayArray(reverseArr(numArray));
    }

    public static int[] reverseArr(int[] arr){
        int i = 0;
        int arrSize = arr.length;
        while(i < arrSize / 2){
            int temp = arr[i];
            arr[i] = arr[arrSize - i - 1];
            arr[arrSize - i - 1] = temp;
            i++;
        }

        return arr;
    }
}
