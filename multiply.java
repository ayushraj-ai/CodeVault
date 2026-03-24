import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        System.out.print("enter number: ");
        int x  = ay.nextInt();
        multiplyy(x);
    }

    static void multiplyy(int v){
       // int m = 1;
        for(int i = 1 ; i <= 10 ; i++){
           int z  = v*i;
            System.out.println(z);
        }
    
    }
}
