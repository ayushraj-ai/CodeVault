import java.util.*;

public class Max_of_subarray_prefixsum {
    public static void prefixsum(int number[]) {

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prifix[] = new int[number.length];

        prifix[0] = number[0];

        for (int i = 1 ; i < prifix.length ; i++){
            prifix [i] = prifix[i - 1] + number[i];
        }
        for(int i = 0 ; i < number.length ; i++){
            int start = i;
            for (int j = i ; j < number.length ; j++){
                int end = j;
                currsum = start == 0 ? prifix[end] :  prifix[end] - prifix[start-1];

                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("MAxsum usin prifix = " + maxsum);
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
            prefixsum(arr);
        }
    }
}
