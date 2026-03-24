import java.util.*;

public class Shortest_path {

    public static void print_char(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static double get_Shortest_path(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            }
        }

        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter directions (N, S, E, W): ");
        String input = ay.nextLine();

        print_char(input);
        double distance = get_Shortest_path(input);
        System.out.println("Shortest Path Distance = " + distance);
    }
}
