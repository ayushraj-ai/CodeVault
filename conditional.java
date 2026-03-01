package DSA;
import java.util.*;

public class conditional {
    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);
       /* while(true) {
            System.out.print("Enter Number: ");
            int x = ay.nextInt();

            if (x % 2 == 0) {
                System.out.println(x + " is even number");
            } else {
                System.out.println(x + " is odd number");
            }
        }*/

        while (true) {

            System.out.print("Enter your marks: ");
            double marks = ay.nextDouble();

            String reportcard = (marks >= 33) ? "Pass" : "Fail";
            System.out.println(reportcard);
        }
    }
}
