package Shorting;
import java.util.*;

public class Quich_Short {
    public static void printarrr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickshort(int[] arr , int  si , int ei){

        if(si >= ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        quickshort(arr, si, pidx-1);
        quickshort(arr, pidx+1, ei);
    }

    public static int partition(int[] arr , int si , int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if(arr[j] <= pivot){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

                int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of index: ");
        int index = sc.nextInt();

        int[] arr = new int[index];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        quickshort(arr, 0, arr.length -1);
        printarrr(arr);
    }
    
}
