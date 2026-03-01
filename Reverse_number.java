import java.util.*;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number you want to reverse: ");
            int x = ay.nextInt();

            while(x > 0){

            int last_digit = x % 10; // for obtain 1st dight or result(reverse the number)
            System.out.print(last_digit);
            x = x / 10; // for remove last digit
         }

          /*  int rev = 0;
            while (x > 0) {
                int last_digit = x % 10;
                rev = (rev * 10) + last_digit;
                x = x / 10;
            }
            System.out.println(rev);


           */
        }
    }
}
