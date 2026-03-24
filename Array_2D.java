import java.util.*;

public class Array_2D {
    public static void Creation(int number[][]) {

        for (int i = 0 ; i < number.length ; i++) {
            for (int j = 0; j < number[0].length; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = ay.nextInt();

        System.out.print("Enter column: ");
        int column = ay.nextInt();

        int matrix[][] = new int[rows][column];

        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("enter number at " + i + " " + j + " : " );
                 matrix[i][j] =ay.nextInt();
            }
        }

        Creation(matrix);
    }
}
