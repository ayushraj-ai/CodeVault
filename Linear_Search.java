import java.util.*;

import java.util.Scanner;

public class Linear_Search {
    public static int Linear_Search(int marks[] , int Search){
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == Search) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number of index: ");
            int a = ay.nextInt();

            int marks[] = new int[a];

            for (int i = 0; i < marks.length; i++) {
                System.out.print("Enter Element: ");
                marks[i] = ay.nextInt();
            }

            System.out.print("Enter element you want to search: ");
            int Search = ay.nextInt();

            int index = Linear_Search( marks , Search);

            if(index == -1){
                System.out.print("Element Not found.");
            }else {
                System.out.println("Element Found at index: " + index);
            }
        }
    }
}
