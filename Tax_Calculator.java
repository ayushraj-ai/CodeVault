import java.util.*;

public class Tax_Calculator {
    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);
        while(true){
        double tax = 0;

        System.out.print("enter your amount: ");
        double x = ay.nextDouble();

        if(x < 500000){
            tax = 0;
        }
        else if (x >= 500000 && x < 1000000) {
            tax = (x * 0.20);
        }
        else if (x >= 1000000){
            tax = x * 0.30;
        }
        double paybale_amount = tax + x;
        System.out.println("your tax amount is: " + tax);
        System.out.println("your total payble amount is: " + paybale_amount);
        }
    }
}
