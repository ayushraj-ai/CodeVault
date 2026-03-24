import java.util.Scanner;

public class largest_Array {
    public static int largest_number(int number[]){
        int largest = Integer.MIN_VALUE;

        for (int i = 0 ; i < number.length; i++){
            if (largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("enter number of inex: ");
            int index = ay.nextInt();

            int number[] = new int[index];

            for (int i = 0; i < number.length; i++) {
                System.out.print("Enter Element at index " + i + ": ");
                number[i] = ay.nextInt();
            }
            int x = largest_number(number);
            System.out.println("Largest Number in array is: " + x);
        }
    }
}
