import java.util.*;

public class Multiplication_table {
    public static void main(String[] args) {

        while (true) {
            Scanner ay = new Scanner(System.in);
            System.out.print("Enter number you want to find multiplication: ");
            long n = ay.nextLong();

            for (int i = 1; i <= 10; i++) {
                long x = n * i;
                System.out.println(n + " * " + i + " are " + x);
            }
        }
    }
}
