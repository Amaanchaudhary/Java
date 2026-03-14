class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Check Array Sorted or not.");
        int[] numArray = ArrayUtility.inputArray();
        boolean isAsc = isAscending(numArray);
        boolean isDesc = isDescending(numArray);
        if(isDesc || isAsc){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is Not Sorted");
        }
    }

    public static boolean isAscending(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDescending(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
