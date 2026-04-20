package enums;

public enum TrafficLight {
    RED("STOP"),
    GREEN("START"),
    YELLOW("Caution");

    private final String action;

    TrafficLight(String action){
        this.action = action;
    }
}
