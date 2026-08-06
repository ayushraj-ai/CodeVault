package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Pairsum {
    /*   // brute force
        // time complexity O(n^2)
    public static boolean pairsum(ArrayList<Integer> list , int target){
        for(int i = 0 ; i < list.size() ; i++){
            for(int j = i + 1 ; j < list.size() ; j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }
*/
/* 
    //optamized
    // for sorted array
    // time complexity O(n)
    public static boolean pairsum(ArrayList<Integer> list , int target){
        int left = 0;
        int right = list.size() - 1;
        while(left < right){
            if(list.get(left) + list.get(right) == target){
                return true;
            }else if( list.get(left) + list.get(right) < target){
                left++;
            }else{
                right--;
            }
        }
        
        return false;
    }
*/
    //a sorted and rotated ArrayList of integers
    // Time Complexity O(n)
    //eg [10, 20, 2, 3, 4, 5]   and Target  = 22
    public static boolean pairsum(ArrayList<Integer> list , int target){
        int piviot = -1;
        int n = list.size();
        for(int i = 0 ; i < list.size() - 1 ; i++){
            if(list.get(i) > list.get(i+1)){
                piviot = i;
                break;
            }
        }
        int left = piviot+1;
        int right = piviot;
        while(left != right){
            if(list.get(left) + list.get(right) == target){
                return true;
            }else if( list.get(left) + list.get(right) < target){
                left = (left+1) % n;
            }else{
                right = (n + right -1) % n;
            }
        }
        return false;
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

        System.out.print("enter target: ");
        int target = sc.nextInt();
        
        System.out.println(pairsum(list , target));
    }
}
