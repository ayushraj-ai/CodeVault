import java.util.*;

public class Bubble_Sort {
    public static void Bubble_Sort(int number[]) {

        for (int turn = 0 ; turn < number.length - 1 ; turn++){
            for (int j = 0 ; j < number.length - 1 -turn ; j++){
                if(number[j] > number[j+1]){
                    //swap
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
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
            Bubble_Sort(element);
        }
    }
}
