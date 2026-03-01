import java.util.Scanner;
public class random {
public static void main(String[] args) {
    
    Scanner ay = new Scanner(System.in);

    int a , b ;

    System.out.print("Enter number a: ");
    a = ay.nextInt();

    System.out.print("Enter b: ");
    b = ay.nextInt();

    if(a*b == 0){
        System.out.println("Hugg");
    }else{
        System.out.println("game over");
    }
}
    
}
