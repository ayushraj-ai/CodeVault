import java.util.Scanner;

public class reverse_num {
    public static void rev_num(int n){
        
        if(n == 1){
            System.out.print(n);
            return ;
        }
        System.out.print(n + " ");
        rev_num(n-1);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int n = scanner.nextInt();

            rev_num(n);
        }
    }
}
