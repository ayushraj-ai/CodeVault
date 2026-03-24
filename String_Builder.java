import java.util.*;             //Stringbilder allow modification
                                //but string cant allow modification
public class String_Builder {
    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = ay.nextLine();

        StringBuilder str = new StringBuilder(name);
        StringBuilder str1 = new StringBuilder("");

       // str.toString();                         //alllow any datatype convert into string but onky when  str is in object form

        for (char i = 'a' ; i <= 'z' ; i++){
            str.append(i);              //add letter behind the imput sting
            str1.append(i);             //time complexity is O(26) when we use .append
        }
        System.out.println(str);
        System.out.println(str1);
    }
}
