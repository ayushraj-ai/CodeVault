import java.util.*;
public class fact_n {
    public static int factorial(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void factorialTail(int n , int ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        ans = ans * n;
        factorialTail(n - 1 , ans);
    }

    // time complexity = O(n)
    // Spacee complexity = O(n)
    public static void main(String[] args) {
        try (Scanner ay = new Scanner(System.in)) {
            while(true){
                System.out.print("Enter number you want to know factorial: ");
                int z = ay.nextInt();
                System.out.println(factorial(z));
                factorialTail(z, 1);
            }
        }
    }
}
