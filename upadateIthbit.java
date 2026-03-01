package DSA;

import java.util.Scanner;

public class upadateIthbit {
    public static int clearIthbit(int n , int i) {
        int bitmass = ~(1 << i);
        return n & bitmass;
    }
    public static int SetITHbit(int n , int i) {
        int bitmass = 1 << i;
        return n | bitmass;
    }

    public static int updateIthbit(int n , int i , int newbit) {
        if (newbit == 0) {
            return clearIthbit(n, i);
        } else {
            return SetITHbit(n , i);
        }
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        while (true){
            System.out.print("Enter number: ");
            int number = ay.nextInt();

            System.out.print("Enter index u want to clear the value at position ith: ");
            int index = ay.nextInt();

            System.out.print("Enter newbit: ");
            int newbit = ay.nextInt();

            System.out.println("afetr clear ith but the value is: " + updateIthbit(number , index , newbit));
        }
    }
}
