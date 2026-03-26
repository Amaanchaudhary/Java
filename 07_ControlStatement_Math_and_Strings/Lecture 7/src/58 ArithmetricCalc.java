class ArithmetricCalc {
    public static void main(String[] args) {
        calculator(20, 10, "SUB");
    }

    public static void calculator(int num1, int num2, String type) {
        int result = switch (type) {
            case "ADD" -> addition(num1, num2);
            case "SUB" -> subtraction(num1, num2);
            case "DIV" -> divide(num1, num2);
            case "MUL" -> multiple(num1, num2);
            default -> 0;
        };
        System.out.println(result);
    }

    public static int multiple(int num1 , int num2){
        return num1 * num2;
    }
    public static int divide(int num1 , int num2){
        return num1 / num2;
    }
    public static int addition(int num1 , int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1 , int num2){
        return num1 - num2;
    }
}
