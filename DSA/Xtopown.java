import java.util.Scanner;

public class Xtopown {
    public static int obtimized (int a , int n){

        if(n == 0){
            return 1;
        }

        int halfoptimized = obtimized(a, n/2) * obtimized(a, n/2);

        if(n%2 != 0){
            halfoptimized = a * halfoptimized;
        }
        return halfoptimized;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(a +" power " + n + " = " + obtimized(a, n));

            sc.close();
        }
    }
}
