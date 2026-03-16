class DiagonalSum {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        System.out.println("Sum of Diagonals is : " + sum);
    }

    public static long sum(int[][] numArr){
        long leftSum = sumOfLeftDiagonal(numArr);
        long rightSum = sumOfRightDiagonal(numArr);
        long sum = leftSum + rightSum;
        if(numArr.length % 2 != 0){
            int center = numArr.length / 2;
            return sum - numArr[center][center];
        }
            return sum;
    }

    public static long sumOfLeftDiagonal(int[][] numArr){
        int sum = 0;
        int i = 0;
        while(i < numArr.length){
            sum += numArr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] numArr){
        int sum = 0;
        int i = 0;
        int j = numArr.length - 1;
        while(i < numArr.length){
            sum += numArr[i][j];
            i++;
            j--;
        }
        return sum;
    }
}
