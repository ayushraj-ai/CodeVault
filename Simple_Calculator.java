import java.util.*;

public class Simple_Calculator {
    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);
        while (true) {
            System.out.print("Enter First number: ");
            double a = ay.nextDouble();

            System.out.print("Enter Second number: ");
            double b = ay.nextDouble();

            System.out.print("Enter operation you want to perform(+ , - , * , / , %): ");
            String operation = ay.next();

            switch (operation) {
                case "+":
                    double sum = a + b;
                    System.out.println(sum);
                    break;

                case "-":
                    double difference = a - b;
                    System.out.println(difference);
                    break;
                case "*":
                    double multipication = a * b;
                    System.out.println(multipication);
                    break;

                case "/":
                    double division = a / b;
                    System.out.println(division);
                    break;

                case "%":
                    double modulo = a % b;
                    System.out.println(modulo);
                    break;

                default:
                    System.out.println("Unknown input");
            }
        }

    }
}
