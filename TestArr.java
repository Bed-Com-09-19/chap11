import java.util.Scanner;
import java.util.ArrayList;

public class TestArr {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("m");
        list.add("A");
        list.add("5");
        list.add("A");
        list.add("56");

        for (int i = 0; i < list.size(); i++) {
            list.remove("A");   
        }
        System.out.println(list.toString());
    }
}