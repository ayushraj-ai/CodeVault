import java.util.*;

public class Function {
    public static int Product(int a , int b){
        int multiply = a * b;

        return multiply;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a: ");
            int a = sc.nextInt();

            System.out.print("Enter b: ");
            int b = sc.nextInt();

            int pro = Product(a, b);
            System.out.println("multiplication of a and b is: " + pro);
        }
    }
}
