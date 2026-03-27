class OccurrenceOfNumber {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int num = 2;
        int occ = 0;
        for (int number : arr){
            if(number == num){
                occ++;
            }
        }
        System.out.println("The Occurrence of number in an Array is " + occ);
    }
}
