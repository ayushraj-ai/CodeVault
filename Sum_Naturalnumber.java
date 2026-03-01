import java.util.*;
public class Sum_Naturalnumber {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        System.out.print("enter number: ");
        int z = ay.nextInt();
        System.out.println(natural(z));
    }
    static int natural(int x){
    
        if (x==1){
            return 1;
        }else{
            return x + natural(x-1);
        }
    }
    
}
