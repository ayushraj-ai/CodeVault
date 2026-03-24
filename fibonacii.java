import java.util.Scanner;
public class fibonacii {

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        System.out.println("enter number: ");
        int z = ay.nextInt();

       
        int first = 0;
        int second = 1;
        for(int i = 2 ; i <= z ; i++ ){
        int next = first + second;
        System.out.println(next);
        
        first = second;
        second = next;
        }

    }
}
