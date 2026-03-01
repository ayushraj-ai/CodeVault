import java.util.*;

public class Array_1 {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter number of index: ");
        int a  = ay.nextInt();

        int marks[] = new int[a];

        for (int i = 0 ; i < marks.length ; i++){
            System.out.print("Enter Element: ");
             marks[i] = ay.nextInt();
        }

        for (int i = 0 ; i < marks.length ; i++){
            System.out.println(marks[i]);
        }
    }
}
