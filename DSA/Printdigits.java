import java.util.*;

public class Printdigits {
    static int countdigits(int n){
        int count = 0;
        while(n >0){
            n /= 10;
            count++;
        }
        return count;
    }
    static void printdigits(int n){
        int count  = countdigits(n);
        int divisor = (int)Math.pow(10 , count -1);
        while(n >0){
            int digit = n / divisor;
            System.out.println(digit);
            n %= divisor;
            divisor /= 10;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            printdigits(num);
        }
    }
}
