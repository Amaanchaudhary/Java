import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Occurences Array.");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Please Enter the Num to find Occurrence : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print("Occurrence of num in an Array is : " + (noOfOccurrences(numArray, num)));
    }

    public static int noOfOccurrences(int[] arr, int num){
        int occurrence = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] == num){
                occurrence++;
            }
            i++;
        }
        return occurrence;
    }


}
