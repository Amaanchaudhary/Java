class MaxMinElementArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Find Min and Max Element in an Array.");
        int[] numArray = ArrayUtility.inputArray();

        System.out.println("Minimum Number in an Array is : " + min(numArray));
        System.out.println("Maximum Number in an Array is : " + max(numArray));
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
