package in.kgcoding;

public class Car {
    public String color;
    public String model;
    private double  fuelLevel;
    long costOfPurchase;

    public Car() {
    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("costOfPurchase=").append(costOfPurchase);
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
