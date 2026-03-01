import java.util.*;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("enter any year: ");
            int year = ay.nextInt();

            boolean x = year % 4 == 0;
            boolean y = year % 100 != 0;
            boolean z = (year % 100 == 0 && year % 400 == 0);

            if (x && (y || z)) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not leap year");
            }
        }
    }
}
