import java.util.Scanner;

public class fabonacci {
    public static int fibo(int n){
        if (n == 0 | n == 1){
            return n;
        }
        int k = fibo(n - 1) + fibo(n - 2);
        return k;
    }

    // Space complexity = O(n)
    //time Complexity O(n^2)
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) { 
            System.out.print("Enter number: ");
            int z = ay.nextInt();
            for (int i = 0; i <= z; i++) {
                 System.out.println(fibo(i) + " ");
            }
            ay.close();
        }
    }
    
}
