import java.util.*;

public class prime_number {
    public static void Prime(int n) {

        if(n == 2 ){
            System.out.println(n + " is prime number");
        }else {
            boolean isprime = true;

            for(int i = 2 ; i <= Math.sqrt(n) ; i++){
                if(n % i == 0){
                    isprime = false;
                }
            }
            if(isprime == true){
                System.out.println(n + " is prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter your number: ");
            int number = sc.nextInt();
            Prime(number);
        }
    }
}
