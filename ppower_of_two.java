import java.util.Scanner;

public class ppower_of_two {
    public static boolean ppower_of_two(int n) {
        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            int number = ay.nextInt();

            System.out.println(ppower_of_two(number));
        }
    }
}
