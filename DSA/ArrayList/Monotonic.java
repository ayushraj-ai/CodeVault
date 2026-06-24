package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Monotonic {
    public static boolean monotonic(ArrayList<Integer> list){
        boolean inc = true;
        boolean dec = true;
    
        for(int i = 0 ; i < list.size()-1 ; i++){
            if(list.get(i) < list.get(i+1)){
                dec = false;
            }else if(list.get(i) > list.get(i+1)){
                inc = false;
            }
        }
        return inc || dec;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("ArrayList elements: " + list);
        System.out.println(monotonic(list));
        
    }
    
}
