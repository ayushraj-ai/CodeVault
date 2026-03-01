import java.util.Scanner;

public class compression {
    public static String comprassion(String args) {
        String newstr ="";

        for (int i = 0 ; i < args.length(); i++){
            Integer count = 1;
            while (i < args.length() - 1 && args.charAt(i) == args.charAt(i + 1)){
                count++;
                i++;
            }
            newstr += args.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = ay.nextLine();

        String sc = comprassion(name);
        System.out.print("Result is: " + sc);
    }
}
