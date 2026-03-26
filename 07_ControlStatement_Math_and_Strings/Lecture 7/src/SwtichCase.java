public class SwtichCase {

    public static void main(String[] args) {
//        oldSwitch(6);
        newSwitch(1);
    }

    public static void newSwitch(int day) {
        String str = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> printWednesday();
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 0, 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(str);
    }

    public static String printWednesday(){
        return "Wednesday printed from function";
    }


    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break; //If Suppose we Not add break here
            // it'll print this and fall down and print the next cases
            // until break comes or till default
            case 6:
            case 0: // Multiple cases for one execution.
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

}
