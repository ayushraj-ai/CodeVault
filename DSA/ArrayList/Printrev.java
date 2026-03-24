package ArrayList;
import java.util.ArrayList;

public class Printrev {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(10);
        list.add(1 , 20);
        System.out.println("Arrays are: " + list);

        for(int i = list.size()-1 ; i >= 0 ; i--){
            System.out.print(list.get(i));
            System.out.print(" ");
        }
    }
    
}
