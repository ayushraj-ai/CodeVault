import java.util.Scanner;
public class Method_fibbo {
   public static void main(String[] args) {
    
    Scanner ay = new Scanner(System.in);
    System.out.print("enter number to find fibbonachi: ");
    int x = ay.nextInt();
    for(int i = 0 ; i <= x ; i++){
    System.out.println(fibonacci(i));
    }
   }
   static int fibonacci(int z){

    if(z <= 1){
        return z;
    }else{
        return fibonacci(z-1) + fibonacci (z - 2);
    }

   } 
}
