import java.util.Scanner;
public class Rando {
    public static void main(String[] args) {
        
        int g = -1;
        int guess = (int)(Math.random()*101);
        Scanner ay = new Scanner(System.in);
        while( g!= guess){
        System.out.printf("enter your number: ");
        int z = ay.nextInt();
    
        if(guess < z){
            System.out.println("to low!");
        }
        else if(guess > z){
            System.out.println("high!");
        }
        else {
            System.out.println("match found: " + guess);
        }
    }

    }
}



