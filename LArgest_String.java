
import java.util.Scanner;

public class LArgest_String {

    public static String findLargestString(String[] names) {
        String largest = names[0];

        for (int i = 1; i < names.length; i++) {
            if (names[i].compareTo(largest) > 0) {
                largest = names[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter how many number of names: ");
        int number = ay.nextInt();
        ay.nextLine(); // consume the leftover newline

        String[] names = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter name: ");
            names[i] = ay.nextLine();
        }

        String largestName = findLargestString(names);
        System.out.println("The lexicographically largest name is: " + largestName);
    }
}
