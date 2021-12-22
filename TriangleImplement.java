import java.util.Scanner;
public class TriangleImplement {
    /**main method */
    public static void main(String[] args) {
       
       //create a scanner object
       Scanner input = new Scanner(System.in);

       System.out.print("Enter 3 sides of the Triangle and color(separated by space) : ");
       double side1 = input.nextDouble();
       double side2 = input.nextDouble();
       double side3 = input.nextDouble();
       String color = input.next(); // color

       System.out.print("Is the Triangle filled with " + color + " color ? (True / False) : ");
       boolean isFilled = input.nextBoolean();

       // create a triangle object
       Triangle tr = new Triangle(side1, side2, side3, color, isFilled);

       System.out.println("The area is " + tr.getArea() + " Parimeter is : " + tr.getPerimeter());
       System.out.println("Color : " + tr.getColor() + " and Filled ? " + tr.isFilled());
    }
}
