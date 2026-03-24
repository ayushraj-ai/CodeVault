import java.util.*;

public class Function_Methods {
    public static void calc_sum(int a , int b) {

        int sum = a + b ;
        System.out.println("sum of a and b is:  " + sum);
    }

    public static void calc_diff(int a , int b) {

        int diff = a - b ;
        System.out.println("Difference of a and b is:  " + diff);
    }

    public static void calc_product(int a , int b) {

        int product = a * b ;
        System.out.println("Product of a and b is:  " + product);
    }

    public static void calc_division(int a , int b) {

        int division = a / b ;
        System.out.println("division of a and b is:  " + division);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.print("pick choice: (+ , - , * , / ): ");
            String choice = sc.next();

            System.out.print("enter a: ");
            int x = sc.nextInt();

            System.out.print("enter b: ");
            int y = sc.nextInt();

            switch (choice){

                case "+" : calc_sum( x , y);
                break;

                case "-" : calc_diff( x , y);
                    break;

                case "*" : calc_product(x , y);
                    break;

                case "/" : calc_division(x , y);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
