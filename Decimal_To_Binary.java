import java.util.*;

public class Decimal_To_Binary {
    public static void DecToBin(int n) {
        int x = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10 , pow));
            n = n / 2;
            pow++;
        }
        System.out.println("Decimal of " + x + " is " + binNum);
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true){
            System.out.print("enter n: ");
            int n = ay.nextInt();

            DecToBin(n);
        }
    }
}
