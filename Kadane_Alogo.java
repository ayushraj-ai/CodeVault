import java.util.*;

public class Kadane_Alogo {
    public static void Kadan (int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0 ; i < number.length ; i++){
            currsum += number[i];

            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(currsum , maxsum);
        }
        System.out.println("Maxsum Using Kadane Algo: " + maxsum);
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of Index: ");
            int index = ay.nextInt();

            int arr[] = new int[index];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number of element at index " + i + " : ");
                arr[i] = ay.nextInt();
            }
            Kadan(arr);
        }
    }
}
