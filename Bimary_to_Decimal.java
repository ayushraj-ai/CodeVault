import java.util.*;

public class Bimary_to_Decimal {
    public static void BinToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int last_digit = binNum % 10;
            decNum = decNum + (last_digit * (int)Math.pow(2 , pow));

            binNum = binNum / 10;
            pow++;
        }
        System.out.println("Decimal of " + myNum + " is " + decNum);
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);
        while (true){
            System.out.print("enter n: ");
            int n = ay.nextInt();

            BinToDec(n);
        }
    }
}
