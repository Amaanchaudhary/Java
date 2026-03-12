public class Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];   // Integer Array with size
//        myArr[0] = 98;
//        myArr[1] = 97;
//        myArr[2] = 91;
//        myArr[3] = 92;

        int[] myArr = {98, 2, 8, 65, 37}; // Integer Array auto size declare

        String[] strArr = new String[4];  // String Array with size declare
        String[] myStrArr = {"hello", "amaan", "8", "65", "37"}; // Integer Array auto size declare

        System.out.println(arraySearching(myArr, 18));

//        System.out.println(myArr[0]);
//        for(int i = 0; i < myArr.length; i++){
//            System.out.println(myArr[i]);
//        }
    }

    public static boolean arraySearching(int[] arr, int num){
        int index = 0;
        while(index < arr.length){
            if(arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }

}
