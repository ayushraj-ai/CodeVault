import java.util.*;

//1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
public class Spiral_Matrix {
    public static void Spiral_Matrix (int number[][] , int rows ,int cols) {

        for (int i = 0 ; i < number.length ; i++) {
            for (int j = 0; j < number[0].length; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        System.out.println("Spiral Order:");

        while (top <= bottom && left <= right) {

            // Print top row
            for (int i = left; i <= right; i++) {
                System.out.print(number[top][i] + " ");
            }
            top++;

            // Print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(number[i][right] + " ");
            }
            right--;

            // Print bottom row (if not already printed)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(number[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column (if not already printed)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(number[i][left] + " ");
                }
                left++;
            }
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

        Spiral_Matrix(matrix , rows , column);
    }
}
