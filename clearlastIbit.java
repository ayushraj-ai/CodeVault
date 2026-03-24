import java.util.Scanner;

public class clearlastIbit {
    public static int clearlastIbit(int n , int i) {
        int bitmass = (~0)<<i;
        return n & bitmass;
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        while (true){
            System.out.print("Enter number: ");
            int number = ay.nextInt();

            System.out.print("Enter index u want to clear the value: ");
            int index = ay.nextInt();

            System.out.println("afetr clear i bit: " + clearlastIbit(number , index));
        }
    }
}
