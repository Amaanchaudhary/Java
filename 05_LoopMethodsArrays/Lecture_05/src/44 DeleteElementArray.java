import java.util.Scanner;

class DeleteElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Delete Element in Array.");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Enter the number to delete : ");
        int num = input.nextInt();
        int[] newArray = deleteElementArr(numArray, num);
        System.out.println("Here is your new Array");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteElementArr(int[] arr, int num) {
        int occ = OccurrencesArray.noOfOccurrences(arr, num);
        if(occ == 0) return arr; // Special Case if no Occurence found
        int newSize = arr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != num) {
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
