package Shorting;
import java.util.*;

public class Merge_shot {

    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort Function
    public static void mergeshot(int[] arr , int si , int ei){

        // Base condition
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si) / 2;

        // Left part
        mergeshot(arr, si, mid);

        // Right part
        mergeshot(arr, mid + 1, ei);

        // Merge both parts
        merge(arr, si, mid, ei);
    }

    // Merge Function
    public static void merge(int[] arr , int si , int mid , int ei){

        int temp[] = new int[ei - si + 1];

        int i = si;        // left pointer
        int j = mid + 1;   // right pointer
        int k = 0;

        // Compare and merge
        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        // Remaining left part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        // Remaining right part
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for(k = 0; k < temp.length; k++){
            arr[si + k] = temp[k];
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of index: ");
            int index = sc.nextInt();

            int[] arr = new int[index];

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number at index " + i + ": ");
                arr[i] = sc.nextInt();
            }

            // Call Merge Sort
            mergeshot(arr, 0, arr.length - 1);

            System.out.print("Sorted Array: ");
            printarr(arr);
        }
    }
}
