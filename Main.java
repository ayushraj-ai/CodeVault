import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static int binarysearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Corrected mid calculation

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter the number of elements you want to enter in the array: ");
        int x = ay.nextInt();

        int[] arr = new int[x];
        System.out.println("Enter " + x + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ay.nextInt();
        }

        Arrays.sort(arr);  
        System.out.println("Sorted elements are: " + Arrays.toString(arr));

        System.out.print("Enter the element you want to search: ");
        int target = ay.nextInt();

        int result = binarysearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        ay.close();  
    }
}
