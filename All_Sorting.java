import java.util.Scanner;

public class All_Sorting {
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

            System.out.print("Enter number of element: ");
            int number = ay.nextInt();

            int element[] = new int[number];
            for (int i = 0; i < element.length; i++) {
                System.out.print("Enter element at index " + i + " is: ");
                element[i] = ay.nextInt();
            }
            int choice;
        do {
            
            System.out.println("1.Bubble_Sort");
            System.out.println("2.Selection_sort");
            System.out.println("3.Insertion_Sort");
            System.out.println("4.Exit");
            System.out.print("enter choice: ");
            choice = ay.nextInt();


                switch (choice){

                    case 1:
                        Bubble_Sort(element);
                        break;

                    case 2:
                        Selection_sort(element);
                        break;

                    case 3:
                        Insertion_Sort(element);
                        break;

                    case 4:
                        System.out.println("Thank you");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }while(choice != 4);
    }
}
