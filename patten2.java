import java.util.Scanner;
public class patten2 {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        System.out.println("enter number: ");
        int z = ay.nextInt();

        for(int i = 1 ; i <= z ; i++){
            for(int j = 1 ; j <= z - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= z ; i++){
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= z - i ; j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
