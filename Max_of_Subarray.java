import java.util.*;

public class Max_of_Subarray {
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

    public static void Bruuteforce(int number[]) {

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
            System.out.print("Enter number of Index: ");
            int index = ay.nextInt();

            int arr[] = new int[index];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number of element at index " + i + " : ");
                arr[i] = ay.nextInt();
            }

        int choice;
        do {
            System.out.println("1.Kadane");
            System.out.println("2.PrifixSum");
            System.out.println("3.Bruteforce");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            choice = ay.nextInt();

            switch (choice) {
                case 1:
                    Kadan(arr);
                    break;

                case 2:
                    prefixsum(arr);
                    break;

                case 3:
                    Bruuteforce(arr);
                    break;

                case 4:
                    System.out.println("Thank you");
                    break;


                default:
                    System.out.println("Invalid Input");
            }
        }while (choice != 4);
    }
}
