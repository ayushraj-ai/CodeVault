import java.util.Scanner;

public class Substring {
    public static String substring(String Name , int s , int e) {
        String name = "";
        for (int i = s; i < e; i++) {
            name += Name.charAt(i);
        }
        return name;
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = ay.nextLine();

        System.out.print("Enter Starting index: ");
        int s = ay.nextInt();

        System.out.print("Enter end index: ");
        int e  = ay.nextInt();

        String substring = name.substring(s , e); //inbuild system substring function

        System.out.println(substring);

        System.out.println(substring(name , s , e));

    }
}
