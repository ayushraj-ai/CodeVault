import java.util.*;

public class Tiling {
    public static int tilingproblem(int n ){
        if(n == 1 || n==0){
            return 1;
        }

        int tnm1 = tilingproblem(n-1);
        int tnm2 = tilingproblem(n-2);
        
        int totaways = tnm1 + tnm2;

        return totaways;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter size of floor: ");
                int a = sc.nextInt();

                System.out.println(tilingproblem(a));
            }
        }
    }
    
}
