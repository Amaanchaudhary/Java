public class TwoDArray {
    public static void main(String[] args) {
        int[][] numArr = new int[2][3];
        int[][] intArry = {{1, 2, 3}, {4, 5, 6}};

        numArr[0][0] = 5;

//        Hetrogenious Array
//        column size is not equal row size is equal, not used mostly.
        int[][] hetroArr = {{1, 2}, {3, 4, 5}};

        int i = 0;
        while(i < hetroArr.length){
            int j = 0;
            while(j < hetroArr[i].length){
                System.out.print(hetroArr[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
