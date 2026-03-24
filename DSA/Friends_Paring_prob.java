import java.util.Scanner;

public class Friends_Paring_prob {
    public static int pairing(int n){
        if(n == 1 || n ==2){
            return n;
        }
        int totalways = pairing(n-1) + pairing(n-1)*pairing(n-2);

        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(pairing(n));
        }
    }
}
