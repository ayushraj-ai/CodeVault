import java.util.Scanner;

public class lastoccurance {
    public static int occursnce(int arr[] , int key , int i ){

        if(i == arr.length){
            return -1;
        }
        
        int isfound = occursnce(arr , key , i+1);

        if(isfound == -1 && arr[i] == key ){
            return i;
        }

        return isfound;

    }
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);

        while(true){
            System.out.print("Enter index: ");
            int x = ac.nextInt();

            int[] arr = new int[x];

            for(int i = 0 ; i < x ; i++){
                System.out.print("Enter number: ");
                arr[i] = ac.nextInt();
            }

            System.out.print("Enter key youu want to find in array: ");
            int key = ac.nextInt();

            System.out.println(occursnce(arr , key , 0));
        }
    }
    
}
