import java.util.*;

public class primeorcomposite {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("enter number");
            int number = sc.nextInt();
            if (number != 5) {
                if (number != 3) {
                    if (number != 2) {
                        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
                            System.out.println(number + " is not prime number");
                        } else {
                            System.out.println(number + "is a prime number");
                        }
                    } else {
                        System.out.println(number + "is a prime number");
                    }

                } else {
                    System.out.println(number + "is a prime number");
                }
            } else {
                System.out.println(number + "is a prime number");
            }
        }
    }
}
