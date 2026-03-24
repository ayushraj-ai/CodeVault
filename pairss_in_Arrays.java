import java.util.*;

public class pairss_in_Arrays {
    public static void Pairs(int number[]) {

        System.out.println("Pairs of arrays are: ");
        for(int i = 0 ; i < number.length ; i++ ){
            int curr = number[i] ;
            for(int j = i+1 ; j < number.length ; j++ ){
                System.out.print("( " + curr + " , " +  number[j] + " )");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Number: ");
            int number = ay.nextInt();

            int arr[] = new int[number];

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number at index " + i + " : ");
                arr[i] = ay.nextInt();
            }
            Pairs(arr);
        }
    }
}
