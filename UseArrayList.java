// import the arrayList class
import java.util.ArrayList;
public class UseArrayList {
    /** main method */
    public static void main(String[] args) {
    
    // create an array list
    ArrayList<Object> objects = new ArrayList<>();
    
    // add a Course object in the array list
    objects.add(new Course("Biology"));
    objects.add(new CircleSub(2.35));
    objects.add(new java.util.Date());
    objects.add("hie");

    System.out.println(objects.get(0).toString());
    System.out.println(objects.get(1).toString());
    System.out.println(objects.get(2).toString());
    System.out.println(objects.get(3).toString());
    
    }
}