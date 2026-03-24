import java.util.Scanner;

public class stebit {
    public static void stebit(int n) {
        int number = n;
        int count = 0;
        while (n > 0){
            if( (n&1) != 0){
                count++;
            }
            n = n >> 1;
        }
        System.out.println("set bit of number "+ number + " is " + count);
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number: ");
            int number = ay.nextInt();

            stebit(number);
        }
    }
}
