import java.util.*;
public class RatinMaze {
    public static int gridWays(char[][] grid, int i, int j, int n, int m) {

    // Out of bounds
    if (i >= n || j >= m) {
        return 0;
    }

    // Blocked cell
    if (grid[i][j] == '0') {
        return 0;
    }

    // Destination reached
    if (i == n - 1 && j == m - 1) {
        return 1;
    }

    int down = gridWays(grid, i + 1, j, n, m);
    int right = gridWays(grid, i, j + 1, n, m);

    return down + right;
}
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int n = sc.nextInt();

        System.out.print("Enter Columns: ");
        int m = sc.nextInt();

        char[][] grid = new char[n][m];

        System.out.println("Enter characters:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println("Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Total number of ways: " + gridWays(grid, 0, 0, n, m));

        sc.close();
    }
}
