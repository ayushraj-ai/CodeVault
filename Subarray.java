import java.util.*;

public class Subarray {
    public static void subarray(int number[]) {

        for(int i = 0 ; i < number.length ; i++){
            int start = i;
            for (int k = i ; k < number.length ; k++){
                int end = k;
                for (int m = start ; m <= end ; m++){
                    System.out.print(number[m] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of subarray are: " + ( number.length*(number.length+1) / 2));
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
