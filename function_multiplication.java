import java.util.*;

public class function_multiplication {
    public static void Multiplication(int n) {
        for(int i = 1 ; i <= 10 ; i++){
            int table = n * i;
            System.out.println(n + " * " + i + " = " + table);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("enter nubmer u want to find multipication: ");
            int x = sc.nextInt();
            Multiplication(x);
        }
    }
}
