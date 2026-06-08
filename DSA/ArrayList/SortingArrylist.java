package ArrayList;
import java.util.*;
public class SortingArrylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1 , 20);
        System.out.println("Arrays are: " + list);

        // for ascending order
        Collections.sort(list); //inbuilt function
        System.out.println("in ascending order: "+ list);

        //for decending order
        Collections.sort(list , Collections.reverseOrder());  //optimized function  * Collections.reverseOrder() is a comparitor to define function logic
        System.out.println("in decending order: " + list);
    }
}
