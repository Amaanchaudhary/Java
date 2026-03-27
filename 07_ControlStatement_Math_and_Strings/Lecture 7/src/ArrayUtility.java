import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Length of Element : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please Enter Element No " + (i + 1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number of Row : ");
        int row = input.nextInt();
        System.out.print("Please Enter the Number of Col : ");
        int col = input.nextInt();

        int[][] numsArr = new int[row][col];

        int i = 0;
        while (i < row) {
            int j = 0;
            while(j < col){
                System.out.print("Please Enter Element For Row " + (i + 1)
                        + " and Col " + (j + 1) + " : ");
                numsArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numsArr;
    }
}
