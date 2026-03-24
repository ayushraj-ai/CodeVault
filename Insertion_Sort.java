import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort {
    public static void Insertion_Sort(int number[]) {

        for(int i = 1 ; i < number.length ; i++){
            int curr = number[i];
            int prev = i - 1;
            while(prev >= 0 && number[prev] > curr){
                number[prev+1] = number[prev];
                prev--;
            }
            number[prev+1] = curr;
        }
        System.out.print("Sorted array is: ");
        for (int i = 0 ; i < number.length ; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of element: ");
            int number = ay.nextInt();

            int element[] = new int[number];
            for (int i = 0; i < element.length; i++) {
                System.out.print("Enter element at index " + i + " is: ");
                element[i] = ay.nextInt();
            }
            Insertion_Sort(element);
           /* Arrays.sort(element);

            for (int i = 0; i < element.length; i++) {
                System.out.print(element[i] + " ");
            }
            System.out.println();
 */
        }
    }
}
