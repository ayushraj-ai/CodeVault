import java.util.Scanner;
// best case O(n)
//worst case O(n^2)

public class Bubble_sort_optimized {
    public static void optimizedbubblesort(int number[]){
        for(int i = 0 ; i < number.length ; i++){
            boolean swapped = false;
            for(int j = 0 ; j < number.length - i -1 ; j++){
                if(number[j] > number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                    break;
                }
        }
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
            optimizedbubblesort(element);
            for(int i = 0 ; i < element.length ; i++){
                System.out.println(element[i]);
            }
        }
    }
}
