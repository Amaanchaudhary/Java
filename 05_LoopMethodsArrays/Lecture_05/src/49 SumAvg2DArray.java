
class SumAvg2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum Avg 2D Array");
        int[][] numsArr = ArrayUtility.input2DArray();
        System.out.println("Sum of All Elements are : " + sum(numsArr));
        System.out.println("Average of All Elements are : " + average(numsArr));
    }

    public static int sum(int[][] numArr) {
        int sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while(j < numArr[i].length){
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static int average(int[][] numArr) {
        if(numArr.length == 0) return 0;
        return sum(numArr) / (numArr.length * numArr[0].length);
    }
}
