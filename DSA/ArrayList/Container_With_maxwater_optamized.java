package ArrayList;
import java.util.Scanner;

public class Container_With_maxwater_optamized {
    public static int storewater(int[] height){
        int left = 0 ;
        int right = height.length - 1;
        int maxwater = 0;

        while(left < right){
            int ht = Math.min(height[left], height[right]);
            int weidth = right - left;
            int currwater = ht * weidth;

            maxwater = Math.max(maxwater, currwater);
            if(left < right){
                left++;
            }else{
                right--;
            }
        }
        
        return maxwater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of index: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Max water store in container is: " + storewater(arr));
    }
    
}
