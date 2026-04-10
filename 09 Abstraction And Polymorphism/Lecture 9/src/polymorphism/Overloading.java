package polymorphism;

public class Overloading {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        int sum = o.sum(1, 2);
        int sum3 = o.sum(3, 4);
        System.out.println(sum3);
        System.out.println(o.sum(1, 2, 3, 4));
        System.out.println(o.add(1, 5));
        System.out.println(o.add("1", "5"));
    }
}
