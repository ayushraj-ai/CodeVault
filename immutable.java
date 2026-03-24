import java.util.*;

public class immutable {
    public static void immutable(String immutable) {
        String nem = immutable;

        for (char i = 'a'; i <= 'z'; i++) {
            nem += i;                                       //time complexity
            System.out.println(nem);                        //26 * n  if 26 is n times value is larger
        }                                                   // n*n is time complexity
        System.out.println(nem);
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter name: ");
        String str = ay.nextLine();

        String str1 = new String(str);

        immutable(str1);
    }
}
