import java.util.*;

public class Bit_even_odd {
    public static void oddoreven(int n) {
        int bit = 1;
        if ((n & bit) == 0) {
            System.out.println(n + " is even number");
        }else {
            System.out.println(n + " is odd number");
        }
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            int number = ay.nextInt();

            oddoreven(number);
        }
    }
}
