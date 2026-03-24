import java.util.Scanner;

public class sortedarry {

    public static boolean isshorted(int arr[] , int i ){
        if(i == arr.length-1 ){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }

        return isshorted(arr , i+1);

    }

    // time complixicty O(n)
    // space complixity O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            
        System.out.print("Enter array length: ");
        int a = sc.nextInt();

        int[] arr = new int[a];

        for(int i = 0 ; i < a ; i++ ){
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(isshorted(arr , 0));
    }

    }
}
