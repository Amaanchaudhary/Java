package varargs;

public class VarArgs {
    public static void main(String... args) {
//        System.out.println(sum(new int[]{1, 2, 3})); // When use array as parameter
        System.out.println(sum(1, 2, 3, 4, 5)); // varArs, Java handle conversion into array itself
    }

    public static int sum(int first, int second, int... a) {
        int sum = first + second;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

//    public static int sum(int[] a) {
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }
}
