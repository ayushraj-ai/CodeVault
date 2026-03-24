import java.util.*;

public class s_o_n_natural {
    public static int sofn_natural(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 0;
        }
        return n + sofn_natural(n - 1);
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) { 
            System.out.print("enter number: ");
            int x = ay.nextInt();
            System.out.println(sofn_natural(x));
        }
    }
}
