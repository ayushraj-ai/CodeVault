import java.util.*;

public class Binary_Search {
    public static int Bin_Search(int number[] , int key ){
        int start = 0 ;
        int end = number.length - 1 ;
        while (start <= end){
            int mid = (start + end) / 2;
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start = mid + 1;
            }else {
                end = mid - 1 ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number of Index: ");
            int index = ay.nextInt();

            int number[] = new int[index];
            for (int i = 0; i < number.length; i++) {
                System.out.print("Enter number " + i + " : ");
                number[i] = ay.nextInt();
            }

            Arrays.sort(number);
            for (int i = 0; i < number.length; i++) {
                System.out.println("sorted element at index " + i + " is " + number[i]);
            }

            System.out.println("Enter element you want to search in array: ");
            int key = ay.nextInt();

            int x = Bin_Search(number, key);
            System.out.println("Element found at index: " + x);
        }
    }
}
