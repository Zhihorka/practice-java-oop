import java.util.*;

public class practiceBlock6Task1 {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String str = str1, T = str2;
        for (int i = 0; i < str1.length(); i++) {
            if (!T.contains(str1.charAt(i) + "")) {
                return false;
            }
            T = T.substring(0, T.indexOf(str1.charAt(i))) + T.substring(T.indexOf(str1.charAt(i)) + 1); // переопределяем Т
            str = str.substring(0, str.indexOf(str1.charAt(i))) + str.substring(str.indexOf(str1.charAt(i)) + 1);
        }
        return T.length() == 0 && str.length() == 0;
    }
    public static String hiddenAnagram(String str, String anagram) {
        StringBuilder bStr = new StringBuilder();
        StringBuilder bAnagram = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                bStr.append(str.charAt(i));
            }
        }
        for (int i = 0; i < anagram.length(); i++) {
            if (Character.isAlphabetic(anagram.charAt(i))) {
                bAnagram.append(anagram.charAt(i));
            }
        }
        if (bStr.length() < bAnagram.length()) {
            return "noutfond";
        }
        str = bStr.toString();
        anagram = bAnagram.toString();
        str = str.toLowerCase(Locale.ROOT);
        anagram = anagram.toLowerCase(Locale.ROOT);
        for (int i = 0; i <= str.length() - anagram.length(); i++) {
            String temp = str.substring(i, i + anagram.length());
            if (isAnagram(temp, anagram)) {
                return temp;
            }
        }
        return "noutfond";
    }

    public static void main(String[] args) {
        System.out.println(hiddenAnagram("My world evolves in a beautiful space called Tesh.", "sworn love lived") );
        System.out.println(hiddenAnagram("An old west action hero actor", "Clint Eastwood"));
        System.out.println(hiddenAnagram("Mr. Mojo Rising could be a song title", "Jim Morrison"));
    }
}
