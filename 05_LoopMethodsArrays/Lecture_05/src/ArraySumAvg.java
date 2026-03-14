
public class ArraySumAvg {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum and Average.");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Sum Average of elements are : " + (average(numArray)));
    }

    public static int sum(int[] arr){
        int sum = 0;
        int count = arr.length;
        int i = 0;

        while(i < count){
            sum += arr[i];
            i++;
        }

        return sum;
    }

    public static double average(int[] arr){
        double sum = sum(arr);
        return sum / arr.length;
    }
}
