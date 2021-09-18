import java.util.*;
import java.util.regex.Pattern;

public class practiceBlock5Task1 {

    public static boolean sameLetterPattern(String fStr, String sStr) {
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
        StringBuilder patternString = new StringBuilder();
        int groupNumber = 1;
        for (int i = 0; i < fStr.length(); i++) {
            if (!hashMap.containsKey(fStr.charAt(i))) {
                hashMap.put(fStr.charAt(i), groupNumber);
                patternString.append("(\\w)");
                groupNumber++;
            } else {
                patternString.append("\\" + hashMap.get(fStr.charAt(i)));
            }
        }
        Pattern p = Pattern.compile(patternString.toString());
        return Pattern.matches(patternString.toString(), sStr);
    }

    public static void main(String[] args) {
        System.out.println(sameLetterPattern("ABAB", "CDCD"));
        System.out.println(sameLetterPattern("ABCBA", "BCDCB"));
        System.out.println(sameLetterPattern("FFGG", "CDCD"));
        System.out.println(sameLetterPattern("FFFF", "ABCD"));
    }
}
