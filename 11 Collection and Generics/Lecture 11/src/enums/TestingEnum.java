package enums;

public class TestingEnum {
    public static void main(String[] args) {
        TrafficLight color = TrafficLight.GREEN;
        color = TrafficLight.RED;
        System.out.println(color);
        Grade grade1 = Grade.C;
        Grade grade2 = Grade.valueOf("D");
        System.out.println(grade1);
        System.out.println(grade2);
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }


    }
}
