package in.knowledgegate;

import in.gettersetter.Car;

public class GetterSetterTest {

    public static void main(String[] args) {
        Car maruti = new Car("Blue", "2013", 3, 90000);
        maruti.setColor("red");
        System.out.printf("Color %s", maruti.getColor());
    }
}
