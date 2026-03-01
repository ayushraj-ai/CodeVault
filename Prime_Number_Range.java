import java.util.*;

public class Prime_Number_Range {
    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2 ; i <= Math.sqrt(n) ; i++){
            if( n % i == 0 ){
                isprime = false;
            }
        }
        return isprime;
    }

    public static void Prime_in_Range(int n){
        for (int i = 2 ; i <= n ; i++){
            if (isprime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter your number: ");
            int number = sc.nextInt();
            Prime_in_Range(number);
        }
    }
}
