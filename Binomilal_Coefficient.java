import java.util.*;

public class Binomilal_Coefficient {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nr = factorial(n - r);

        return fact_n / (fact_r * fact_nr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter n: ");
            int n = sc.nextInt();

            System.out.print("Enter r: ");
            int r = sc.nextInt();

            int fact = binomialCoefficient(n, r);
            System.out.println("Binomial factorial is: " + fact);
        }
    }
}
