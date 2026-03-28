public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(String company, String modelNumber, String name,
               int maxSpeed, int noOfDoors, int noOfWheels) {
        this.company = company;
        this.modelNumber = modelNumber;
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
    }

    public static void main(String[] args) {
        Car swift = new Car("maruti", "19202",
                "Swift", 140,
                4, 4);

//        System.out.println(swift.toString());
        System.out.println(swift);    // Both Are Same Auto toString call when print Object.
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "noOfWheels=" + noOfWheels +
//                ", noOfDoors=" + noOfDoors +
//                ", maxSpeed=" + maxSpeed +
//                ", name='" + name + '\'' +
//                ", modelNumber='" + modelNumber + '\'' +
//                ", company='" + company + '\'' +
//                '}';
//    }
}
