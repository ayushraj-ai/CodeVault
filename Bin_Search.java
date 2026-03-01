import java.util.Scanner;
public class Bin_Search {
    public static int [] selection_sort(int [] ar, int l){
        for(int i=0;i<l-1;i++){
            int min = i;
            for(int j=i+1;j<l;j++){
                if (ar[j]<ar[min]){
                    min = j;
                }
            }
            int x = ar[i];
            ar[i] = ar[min];
            ar[min]=x;
        }
        return ar;
}
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        int l = 200000;
        int[] ar = new int[l];
        for(int i = 0;i<l;i++){
            ar[i] = (int)(Math.random()*l);
    }
        int[] sarr= selection_sort(ar, l);
        int i = 0;
        for(int x : sarr){
            System.out.print(x+" ");
            i++;
            if (i%20==0) {
                System.out.println("");
            }
    }
    long endTime = System.nanoTime();
    long duration = endTime - startTime;
    System.out.println("Execution time: " + duration / 1_000_000 + " milliseconds");
    sc.close();
    }
}