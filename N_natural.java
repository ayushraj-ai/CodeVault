import java.util.*;

public class N_natural {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("enter number: ");
        int number = ay.nextInt();;

        int sum = 0 , count = 0;

        while (count <= number){
            sum += count;
            count++;
        }
        System.out.println("Sum of n natural number is: " + sum);
    }
}
