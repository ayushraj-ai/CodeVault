import java.util.Scanner;

public class fast_expo_square {
    public static int fast_expo_square(int n , int sq) {
        int ans  = 1;
        while (sq > 0){
            if((sq&1) != 0){
                ans = ans * n;
            }
            n = n * n;
            sq = sq >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);
        while (true){
            System.out.print("Enter number: ");
            int number = ay.nextInt();

            System.out.print("Enter power: ");
            int pow  = ay.nextInt();
            
            System.out.println("Square of " + number + " is " + fast_expo_square(number , pow));
        }
    }
}
