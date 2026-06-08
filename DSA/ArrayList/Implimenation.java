package ArrayList;
import java.util.*;
public class Implimenation {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        //add element it take o(1) time
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1 , 20); //it take o(n) time
        System.out.println("Arrays are: " + list);

        //Size of AL
        System.out.println(list.size());

        //get element    o(1)
        int element = list.get(2);
        System.out.println("get element: " + element);

        //remove element    o(n)
        list.remove(2);
        System.out.println("element after remove : " + list);

        //set element at index   o(n)
        list.set(2 , 10);
        System.out.println("element after set: " + list);

        //contains element  o(n)
        System.out.println(list.contains(10));
        System.out.println(list.contains(2));


        //print array list
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i));
            System.out.print(" ");
        } 
    }
}

