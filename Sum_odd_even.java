package DSA;
import java.util.*;

public class Sum_odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i = 0 ; i <= n ; i++){
            if(i % 2 == 0){
                evenSum += i;
            } else{
                oddSum += i;
            }
        }
            System.out.println("Sum of even number is: " + evenSum);
            System.out.println("Sum of odd number is: " + oddSum);

    }
}


