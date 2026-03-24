import java.util.*;

public class CleatiTHposition {
    public static int SetITHbit(int n , int i) {
        int bitmass = ~(1 << i);
        return n & bitmass;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        while (true){
            System.out.print("Enter number: ");
            int number = ay.nextInt();

            System.out.print("Enter index u want to clear the value at position ith: ");
            int index = ay.nextInt();

            System.out.println("afetr clear ith but the value is: " + SetITHbit(number , index));
        }
    }
}
