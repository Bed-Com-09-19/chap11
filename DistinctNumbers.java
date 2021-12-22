import java.util.Scanner;
import java.util.ArrayList;

public class DistinctNumbers {
    /**main method */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //create a scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integers (input ends with zero) : ");
        
        int value; // declare a variable first
        do {
            value = input.nextInt();

            if (!list.contains(value) && value != 0) {
                list.add(value);
            }
        } while (value != 0); 
        
        list.add(4, 45);

        // display the distinct numbers
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}