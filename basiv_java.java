import java.util.*;

public class basiv_java {
    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);
        System.out.print("enter amount of pencil: ");
        float x = ay.nextFloat();

        System.out.print("enter amount of pen: ");
        float y = ay.nextFloat();

        System.out.print("enter amount of eraser: ");
        float z = ay.nextFloat();

        float total_amount = x + y + z;
        System.out.println("your total amount is: " + total_amount);

        double d = 99.9954;
        short s = 512;
        System.out.println(d*s);
    }
}
