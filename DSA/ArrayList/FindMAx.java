package ArrayList;
import java.util.ArrayList;

public class FindMAx {
    public static void main(String[] args) {
    ArrayList <Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        //add element it take o(1) time
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(10);
        System.out.println("Arrays are: " + list);
        list.add(1 , 20); //it take o(n) time

         for(int i = 0 ; i <list.size() ; i++){
            System.out.print(list.get(i));
            System.out.println();
         /*    if(max < list.get(i)){
                max = list.get(i);
            }*/
            max = Math.max(max, list.get(i));
        }
        System.out.println("maximum elemt is: " + max);

    }
}
