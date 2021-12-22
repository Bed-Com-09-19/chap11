public class CastingDemo {
    /**main method */
    public static void main(String[] args) {
        // create and initialize 2 objects
        Object object1 = new CircleSub(1);
        Object object2 = new Rectangle(1,1);

        // display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }

    /**displaying method */
    public static void displayObject(Object object) {
        if (object instanceof CircleSub) {
            System.out.println("The area is : " + ((CircleSub)object).getArea());
        }

        else if (object instanceof Rectangle) {
            System.out.println("The area of the rectangle is : " + ((Rectangle)object).getArea());
        }
    }
}