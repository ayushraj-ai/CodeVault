import java.util.*;

public class Duplicate_String {

    public static void rmoveduplicate(String str, int idx,
                                      StringBuilder newstr,
                                      boolean map[]) {

        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);

        if (map[currchar - 'a'] == true) {
            rmoveduplicate(str, idx + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            newstr.append(currchar);

            rmoveduplicate(str, idx + 1, newstr, map);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string name: ");
        String str = sc.nextLine();

        rmoveduplicate(str, 0, new StringBuilder(""),
                        new boolean[26]);
    }
}
