import java.util.*;

public class rainwater_Trapped {
    public static int rainwater_Trapped(int Height[]) {
        int n = Height.length;

        // Calculate leftmax boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = Height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], Height[i]);
        }

        // Calculate rightmax boundary - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = Height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], Height[i]);
        }

        // Calculate trapped water
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - Height[i];
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number of Index: ");
            int index = ay.nextInt();

            int arr[] = new int[index];
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter height at index " + i + ": ");
                arr[i] = ay.nextInt();
            }

            int x = rainwater_Trapped(arr);
            System.out.println("Trapped water is: " + x);
        }
    }
}
