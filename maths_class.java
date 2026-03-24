import java.sql.SQLOutput;
import java.util.Scanner;

public class maths_class {
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double square_root(int n) {
        return Math.sqrt(n);
    }

    public static double power(int a, int b) {
        return Math.pow(a, b);
    }

    public static int absolute_value(int x) {
        return Math.abs(x);
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        int a;
        int b;
        int n;
        int x;
        int c;
        double d;

        while (true) {
            System.out.print("Enter choice(1 = min , 2 = max , 3 = Square_root , 4 = power , 5 = absolute_value): ");
            int choice = ay.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter a: ");
                    a = ay.nextInt();
                    System.out.print("Enter b: ");
                    b = ay.nextInt();
                    c = min(a, b);
                    System.out.println(c);
                    break;

                case 2:
                    System.out.print("enter a: ");
                    a = ay.nextInt();
                    System.out.print("Enter b: ");
                    b = ay.nextInt();
                    c = max(a, b);
                    System.out.println(c);
                    break;

                case 3:
                    System.out.print("Enter n: ");
                    n = ay.nextInt();
                    d = square_root(n);
                    System.out.println(d);
                    break;

                case 4:
                    System.out.print("enter a: ");
                    a = ay.nextInt();
                    System.out.print("Enter b: ");
                    b = ay.nextInt();
                    d = power(a, b);
                    System.out.println(d);
                    break;

                case 5:
                    System.out.print("enter x: ");
                    x = ay.nextInt();
                    c = absolute_value(x);
                    System.out.println(c);
                    break;

                default:
                    System.out.println("invalid input please enter valid input");
            }
        }
    }
}
