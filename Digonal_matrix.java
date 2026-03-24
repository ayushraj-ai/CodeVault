import java.util.*;

public class Digonal_matrix {
    public static void Digonal_matrix(int number[][] , int rows) {

        for (int i = 0 ; i < number.length ; i++) {
            for (int j = 0; j < number[0].length; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        int Digonal1 = 0;
        int Digonal2 = 0;

        for(int i = 0 ; i < number.length ; i++){
            for (int j = 0; j < number[0].length; j++) {
                if(i == j){
                    Digonal1 += number[i][j];
                }
            }
        }
        System.out.println("Sum of Digonal1 is: " + Digonal1);

        for (int i = 0 ; i < number.length ; i++){
            for (int j = 0; j < number[0].length; j++) {
                if(i + j == rows - 1){
                    Digonal2 += number[i][j];
                }

            }
        }
        System.out.println("Sum of diognal2 is: " + Digonal2);

        int Total_Sum = Digonal1 + Digonal2;
        System.out.println("Total sum od Digonal1 and Digonal2 is: " + Total_Sum);
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        while (true) {
            System.out.print("Enter rows: ");
            int rows = ay.nextInt();

            System.out.print("Enter column: ");
            int column = ay.nextInt();

            int matrix[][] = new int[rows][column];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print("enter number at " + i + " " + j + " : ");
                    matrix[i][j] = ay.nextInt();
                }
            }
            Digonal_matrix(matrix , rows);
        }
    }
}
