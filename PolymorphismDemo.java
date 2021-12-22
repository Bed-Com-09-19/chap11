public class PolymorphismDemo {
    /**main method */
    public static void main(String [] args) {
        // desplay x circle and rectangle properties
        displayObject(new CircleSub(1, "red", false));
        displayObject(new Rectangle(1,1,"black", true));

        GeometricObjects i = new CircleSub(2);
        System.out.println(i.getColor());
    }

    public static void displayObject(GeometricObjects object) {
        System.out.println("created on " + object.getDateCreated() + ". color is " + object.getColor());
    }
}