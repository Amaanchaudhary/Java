public class ForEachLoop {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Amaan", "Roahn", "Abc", "Aaro"
        };

        printArr(array);
    }

    public static void printArr(String[] arr){
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        for(String name : arr){
            System.out.println(name);
        }
    }
}
