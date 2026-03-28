public class StringFormat {
    public static void main(String[] args) {
        String name = "Amaan";
        int age = 23;

//        System.out.println("Hello, " + name + " your age is : " + age); More Memory Consumed in String Pool due to Concatination
        System.out.printf("Hello,%s you age is %d", name, age);
    }
}
