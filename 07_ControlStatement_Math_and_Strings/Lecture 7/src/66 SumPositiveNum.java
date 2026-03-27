class SumPosNumber {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int sum = 0;
        for (int number : arr){
            if(number < 0){
                continue;
            }
            sum += number;
        }
        System.out.println("The Sum of + number in an Array is " + sum);
    }
}
