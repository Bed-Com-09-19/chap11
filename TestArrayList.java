import java.util.ArrayList;
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        // add some cities in the list
        cityList.add("London");
        cityList.add("Denver");  // 2 cities in
        cityList.add("Paris");  // 3 cities in
        cityList.add("Miami"); // 4 cities in
        cityList.add("Seul"); // 5 cities in
        cityList.add("Tokyo"); // 6 cities in

        System.out.println("List size ? " + cityList.size());
        System.out.println("Is Miami in the list ? " + cityList.contains("Miami"));
        System.out.println("Location of denver in the list is " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty ? " + cityList.isEmpty());

        // insert a new city at index 2
        cityList.add(2,"Xian");

        // remove a city from the List
        cityList.remove("Miami");

        // remove a city at index 1
        cityList.remove(1);

        // desplay the contents in the list 
        System.out.println(cityList.toString());

        // desplay the contentsin the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
        }

        System.out.println(); // skip a line

        // create a list to store 2 circles
        ArrayList<CircleSub> list = new ArrayList<>();

        // add two circles
        list.add(new CircleSub(2));
        list.add(new CircleSub(3));

        // display the area of the first circle in the list
        System.out.println("The area of the circle ? " + list.get(0).getArea());
    }
}