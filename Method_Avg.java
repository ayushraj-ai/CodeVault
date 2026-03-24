import java.util.Scanner;
public class Method_Avg {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        System.out.print("enter number: ");
        int z = ay.nextInt();

        Avge(z);
    }

    static void Avge(int x){
    int y = 0;
    int v = 0;
    for (int i = 0; i <= x; i++) {
         y = y + i;
         v = y / x;   
    }
    System.out.println(v);

    }
}