import java.util.Scanner;

class MonthOfYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Month : ");
        int num = input.nextInt();
        findYear(num);
    }

    public static void findYear(int month) {
        String str = switch (month) {
            case 1 -> "JAN";
            case 2 -> "FEB";
            case 3 -> "MAR";
            case 4 -> "APR";
            case 5 -> "MAY";
            case 6 -> "JUN";
            case 7 -> "JUL";
            case 8 -> "AUG";
            case 9 -> "SEP";
            case 10 -> "OCT";
            case 11 -> "NOV";
            case 12 -> "DEC";
            default -> "Invalid";
        };
        System.out.println(str);
    }

}
