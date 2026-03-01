import java.util.*;

public class SDAI {
    public static void SOTDIAI(int n) {
            int my_number = n;
            int sum = 0;
            while(n > 0){
                int lastdigit = n % 10;
                sum += lastdigit;
                n = n / 10;
            }
        System.out.println("Sum of digits of " + my_number + " is: " + sum);
    }
    

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            int x = ay.nextInt();
            SOTDIAI(x);
        }
    }
}
