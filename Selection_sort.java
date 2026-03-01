import java.util.*;

public class Selection_sort {
    public static void Selection_sort(int number[]) {
        for (int i = 0 ; i < number.length - 1 ; i++){
            int minpos = i;
            for (int j = i+1 ; j < number.length ; j++){
                if(number[minpos] > number[j]){
                    minpos = j;
                }
            }
            //swap
            int temp = number[minpos];
            number[minpos] = number[i];
            number[i] = temp;
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
            Selection_sort(element);
        }

    }
}
