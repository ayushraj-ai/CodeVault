import java.util.*;
public class Nqueen {
    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical upward check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Digonal left upper side check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal right upper side check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nqueen(char board[][], int row) {
        // base case
        if (row == board.length) {
            printboard(board);
            count++;
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1); // recursive call
                board[row][j] = 'x'; // backtracking
            }
        }
    }

    // print board
    public static void printboard(char board[][]) {
        System.out.println("-----chess board-----");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter the size of the board: ");
                int n = sc.nextInt();
            // initilize the board
            char[][] board = new char[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = 'x';
                }
            }
            nqueen(board, 0);
                System.out.println("Total number of ways to solve the N-Queens problem: " + count);
            }
        }
    }
}
