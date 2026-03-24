import java.util.*;

public class to_upppercase {
    public static String touppercase(String name) {
        StringBuilder str = new StringBuilder(name);

        char ch = Character.toUpperCase(str.charAt(0));
        str.append(ch);

        for (int i = 1 ; i < name.length() ; i++){
            if(name.charAt(i) == ' ' && i < name.length() -1){
                str.append(name.charAt(i));
                i++;
                str.append(Character.toUpperCase(name.charAt(i)));
            }else{
               str.append(name.charAt(i));
            }
        }
        return str.toString();
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = ay.nextLine();

        String sc = touppercase(name);
        System.out.println(sc);
    }
}
