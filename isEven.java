import java.util.*;

public class isEven{
    public static boolean iseven(int number) {
        boolean iseven = true;
            if(number % 2 != 0){
                iseven = false;
            }

        return iseven;
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number: ");
            int n = ay.nextInt();

            boolean a = iseven(n);
            System.out.println(a);
        }
    }
}
