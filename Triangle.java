public class Triangle extends GeometricObjects{
    protected double side1 = 1.0;
    protected double side2 = 1.0;
    protected double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double s1, double s2, double s3, String color, boolean isFilled) {
        super(color, isFilled);
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    // getter methods
    protected double getSide1() {
        return side1;
    } 

    protected double getSide2() {
        return side2;
    }

    protected double getSide3() {
        return side3;
    }

    protected double getArea() {
        return 0.5 * side3 * side2 * side1;
    }

    protected double getPerimeter() {
        return 3 * (side1 + side2 + side3);
    }
     
    public String toString() {
        return "Triangle : side1 = " + side1 + " side2 = " + side2 + "side3 = " + side3;
    }
    
}