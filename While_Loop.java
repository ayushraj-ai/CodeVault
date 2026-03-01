package DSA;
import java.util.*;

public class While_Loop {
    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = ay.nextInt();;

        int count = 1;
        while (count <= number) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
    }
}
