package Shorting;

import java.util.Scanner;

public class Rotates_shorted_Array {
    public static int search(int[] arr , int tar ,int si , int ei){
        if(si > ei){
            return -1;
        }
        
        int mid = si + (ei - si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
            return search(arr, tar, mid+1, ei);
            }
        }else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }else{
                return search(arr, tar, si, mid-1);
            }
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

            System.out.print("Enter target: ");
            int tar = sc.nextInt();

            System.out.print(search(arr, tar, 0, arr.length - 1));
        }
    }
    
}
