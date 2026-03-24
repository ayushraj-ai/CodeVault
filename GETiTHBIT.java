import java.util.*;

public class GETiTHBIT {
    public static int GETITHBIT(int n ,int i) {
        int bitmass = 1 << i;
        if((n & bitmass) == 0){
            return 0;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            int number = ay.nextInt();

            System.out.print("Enter index you want to find bit: ");
            int index = ay.nextInt();

            System.out.println("bit at " + index + "th posion: " + GETITHBIT(number, index));

        }
    }
}
