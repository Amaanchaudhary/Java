class Circle {
    double radiumInMm;

    Circle(double radiusInMm){
        this.radiumInMm = radiusInMm;
    }

    double getCircumference(){
        return 2 * radiumInMm * Math.PI;
    }

    double getArea(){
        return Math.PI * Math.pow(radiumInMm, 2);
    }

    @Override
    public String toString() {
        return "Circle Props: Radius in mm: " + radiumInMm
                + ", Circumference in mm: " + getCircumference()
                + ", Area in mm2: " + getArea();
    }

    public static void main(String[] args) {
        Circle circle = new Circle(30);
        System.out.println(circle);
    }

}
