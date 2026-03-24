import java.util.*;

public class pelindrome {
    public static void pelindrome (int x) {
        int number = x;
        int rev = 0 ;

        while(x > 0){
            int last_digi = x % 10;
            rev = (rev * 10 ) + last_digi;
            x = x / 10;
        }
        System.out.println(rev);

        if (rev == number) {
            System.out.println(number + " is pelendrome number");
        }else {
            System.out.print(number + " is not pelindrome number");
        }
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
    while (true) {
        System.out.print("Enter a: ");
        int a = ay.nextInt();
        pelindrome(a);
    }
    }
}
