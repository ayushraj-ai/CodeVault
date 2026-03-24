public class call_by_value {
    public static void Swap(int x , int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        int a = 5;
        int b= 10;

        Swap(a , b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
