import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Array Search");
        int[][] numsArr = ArrayUtility.input2DArray();
        System.out.print("Now Enter the Number to Search : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean isFound = search(numsArr, num);
        if(isFound){
            System.out.println("Number Found");
        }else {
            System.out.println("Not Found");
        }
    }

    public static boolean search(int[][] numArr, int num) {
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while(j < numArr[i].length){
                if(numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
