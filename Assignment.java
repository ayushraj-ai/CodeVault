
public class Assignment {

    public static void main(String[] args) {
        int n = 4;
        int i, j;
        int num = 1;

        for (i = 1; i <= n; i++) {
          
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

 
        for (i = n-1; i >= 1; i--) {
    
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        
    }
}
