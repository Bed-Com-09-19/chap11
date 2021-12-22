public class TestCircleRectangle{
    public static void main(String[] args) {
        CircleSub crc = new CircleSub(2);
        System.out.println("A circle " + crc.toString());
        System.out.println("The color is " + crc.getColor());
        System.out.println("The radius is " + crc.getRadius());
        System.out.println("The area is " + crc.getArea());
        System.out.println("The diameter is " + crc.getDiameter());
          
        Rectangle rec = new Rectangle(2,4);
        System.out.println("\nA rectangle " + rec.toString());
        System.out.println("The area is " + rec.getArea());
        System.out.println("The perimeter is " + rec.getPerimeter());    
    }
}