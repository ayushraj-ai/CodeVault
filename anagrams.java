import java.util.*;

public class anagrams {
    public static void anagrams(String word1 , String word2) {
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        if (word1.length() != word2.length()) {
            System.out.println("Not anagrams (different lengths)");
            return;
        }

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes, they are anagrams.");
        } else {
            System.out.println("No, they are not anagrams.");
        }
    }
    public static void main(String[] args) {
        Scanner ay = new Scanner(System.in);

        System.out.print("Enter Word: ");
        String str = ay.nextLine();

        System.out.print("Enter 2nd Word: ");
        String str1 = ay.nextLine();

        anagrams(str , str1);
    }
}
