import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius r: ");
        int r = sc.nextInt();

        double area = 3.14 * r * r;
        System.out.println("sum of a and b is: " + area);
    }
}
