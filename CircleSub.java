public class CircleSub extends  GeometricObjects{
    private double radius = 1.0;

    public CircleSub() {}
    
    public CircleSub(double radius) {
        this.radius = radius;
    }

    // constructor to inheret parent methods and data  fields
    public CircleSub(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setIsFilled(filled);
        
    }

    public double getRadius() {
        return radius;
    }

    public  void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public void PrintCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    public String toString() {
        return super.toString() + "\nRadius";
    }
}