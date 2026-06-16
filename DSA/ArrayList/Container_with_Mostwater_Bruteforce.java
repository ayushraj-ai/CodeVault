package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
//Brute force
public class Container_with_Mostwater_Bruteforce {
    public static int storewater(ArrayList<Integer> height){
        int maxwater = 0;
        for(int i = 0 ; i< height.size() ; i++){    //for L1
            for(int j = 0 ; j < height.size() ; j++){   //for L2
                int ht = Math.min(height.get(i) , height.get(j));
                int weidth = j - i;
                int currentwatter = ht * weidth;
                maxwater = Math.max(maxwater, currentwatter);
            }
        }
        return maxwater;
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

        System.out.println("Most water in a conatainer = " + storewater(list));
        
    }
}
