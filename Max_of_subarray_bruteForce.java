import java.util.Scanner;

public class Max_of_subarray_bruteForce {
    public static void subarray(int number[]) {

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0 ; i < number.length ; i++){
            int start = i;
            for (int k = i ; k < number.length ; k++){
                int end = k;
                currsum = 0;
                for (int m = start ; m <= end ; m++){
                    System.out.print(number[m] + " ");
                    currsum += number[m];
                    if(maxsum < currsum){
                        maxsum = currsum;
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarray are: " + ( number.length*(number.length+1) / 2));
        System.out.println("maxsum of array using bruteforce: " + maxsum);
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int number = ay.nextInt();

            int arr[] = new int[number];

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number at index " + i + " : ");
                arr[i] = ay.nextInt();
            }

            subarray(arr);
        }

    }
}
