import java.util.*;

public class Reverse_Array {
    public static void Revv(int number[]) {

         for (int i = number.length - 1; i >= 0; i--) {
                System.out.println("Element at index " + i + " is: " + number[i]);
            }

       /* int first = 0 , last = number.length - 1;

        while (first < last){
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i < number.length; i++) {
            System.out.println("Element at index " + i + " is: " + number[i]);
        }
            */
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number of index: ");
            int index = ay.nextInt();

            int number[] = new int[index];
            for (int i = 0; i < number.length; i++) {
                System.out.print("Enter element at index " + i + ": ");
                number[i] = ay.nextInt();
            }
           /* for (int i = number.length - 1; i >= 0; i--) {
                System.out.println("Element at index " + i + " is: " + number[i]);
            } */

            Revv(number);
        }
    }
}
