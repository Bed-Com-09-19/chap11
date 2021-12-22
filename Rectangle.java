public class Rectangle extends GeometricObjects {
    private double width = 1;
    private double height = 2;

    public Rectangle() {}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setIsFilled(filled);
    }

    public double getwidth() {
        return width;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}