public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5; // AutoMatic Conversion small value into Big container - Auto
        System.out.println(myFloat);
        int myInt = (int) 5.0f;  // Explicit Casting Large Value into Small Container
        System.out.println(myInt);

        //Auto
        long big = 45;
        float dec = 3;
        double d = 3.4f;

        //Explicit
        float eDec = (float) 3.4;
        long eBig = (long) 3.4;
        int eInt = (int) 3.4;
    }
}
