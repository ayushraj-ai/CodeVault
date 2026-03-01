import java.util.Scanner;

public class clearrandebit {
    public static int clearrandebit(int n , int i , int j) {
        int a  = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitmass = a | b;
        return n & bitmass;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        while (true){
            System.out.print("Enter number: ");
            int number = ay.nextInt();

            System.out.print("Enter index u want to clear the value at position ith to jth position: ");
            int index1 = ay.nextInt();
            int index2 = ay.nextInt();

            System.out.println("after clear between i and j bit the value is: " + clearrandebit(number , index1 , index2));
        }
    }
}
