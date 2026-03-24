import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';

        while (true) {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            System.out.println("First pattern end Here:");

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= (n - i + 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("Second pattern end Here:");

            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            System.out.println("3rd pattern ends here:");

            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= (n - i + 1) ; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
            System.out.println("4th pattern ends here:");

            for(int i = 1 ; i <= n ; i++){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
            System.out.println("5th pattern ends here:");

        }
    }
}
