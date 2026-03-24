import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        while (true) {
            int factorial = 1;
            Scanner ay = new Scanner(System.in);
            System.out.print("Enter number you want to find factorial: ");
            int number = ay.nextInt();

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
