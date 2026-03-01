import java.util.*;

public class Strings {
    public static void print_char(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner ay = new Scanner(System.in);

        System.out.println("Enter Your name: ");
        String name = ay.nextLine();

        System.out.println(name);

        System.out.println(name.length()); //String ka length pata chlta hai iise jo input hamm denge

        //Concatenate
        System.out.print("Enter your first name: ");
        String First_Name = ay.nextLine();
        System.out.print("Enter your last name: ");
        String Last_Name = ay.nextLine();

        //Concat
        String Full_Name = First_Name + " " +  Last_Name;
        System.out.println("Conacat of first and last name is: " + Full_Name); //Do naam ko jodna

        System.out.println(Full_Name.charAt(1));//char.at se character ka pata chalta hi jo index hamm input me dete hai

        print_char(Full_Name);

        //String comparision

        System.out.println("Enter name u want to comapare with another: ");
        String name1 = ay.nextLine();

        System.out.println("Enter 2nd name u want to comapare with another: ");
        String name2 = ay.nextLine();

        System.out.println("Enter 3rd name u want to comapare with another: ");
        String name4 = ay.nextLine();

        String name3 = new String(name4);


        if (name1.equals(name2)) {
            System.out.println("name1 and name2 are equal");
        }
        if (name1.equals(name3)) {
            System.out.println("name1 and name3 are equal");
        }
        if (name2.equals(name3)) {
            System.out.println("name2 and name3 are equal");
        }
        if (!name1.equals(name2) && !name1.equals(name3) && !name2.equals(name3)) {
            System.out.println("All names are unequal");
        }
    }
}
