import java.util.*;

public class Bit_wise {
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter first  number: ");
        int num = ay.nextInt();

        System.out.print("Enter second number: ");
        int num1 = ay.nextInt();

        int sum = num & num1;    //And bitwise
        int sum2 = num | num1; // or operator
        int sum3 = num ^ num1; //xor operator
        int num4 = num << num1; //leftshift by num1 , then formula is a * 2^b
        int num5 = num >> num1; //rightshift by num1 , and formula is a / 2^b


        System.out.println("And operator: " + sum);
        System.out.println("or operator: " + sum2);
        System.out.println("XOR operator: " + sum3);
        System.out.println("1s complement of first number: " + ~num);
        System.out.println("Lest shift is: " + num4);
        System.out.println("Right Shift " + num5);
    }
}
