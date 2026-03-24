package Pattern;
import java.util.*;

public class Pattern {
    static void printsquare(int n){
        System.out.println("printsquare");
        for(int row = 1 ; row <= n ; row++){
            for(int star = 1 ; star <= n ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void hollostar(int n){
        System.out.println("prinhollowsquare");
        for(int row  = 1 ; row <= n ; row++){
            for(int star = 1 ; star <= n ; star++){
                if(row == 1 || row == n || star == 1 || star == n){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printstar(int n){
        System.out.println("printrighttriangle");
        for(int row = 1 ; row <= n ; row++){
            for(int star = 1 ; star <= n ; star++){
                if(star <= row){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

     static void printinverserighttriangle(int n){
        System.out.println("printinverserighttriangle");
        for(int row = 1 ; row <= n ; row++){
            for(int star = 1 ; star <= n ; star++){
                if(star <= n - row + 1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    static void lefttriangle(int n){
        System.out.println("printlefttriangle");
        for(int row = 1 ; row <= n ; row++){
            for(int star = 1 ; star <= n ; star++){
                if(star <= n - row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
     static void printteverserightstarspace(int n){
        System.out.println("printteverserightstarspace");
        for(int row = 1 ; row <= n ; row++){
            for(int star = 1 ; star <= n ; star++){
                if(star < row){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Ente n: ");
        int n = ay.nextInt();

        printsquare(n);
        hollostar(n);
        printstar(n);
        printinverserighttriangle(n);
        lefttriangle(n);
    
    }
    
}
