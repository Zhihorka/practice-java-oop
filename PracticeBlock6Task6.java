import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeBlock6Task6 {

    public static String fractions(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        ArrayList<String> find = new ArrayList<>();
        while (matcher.find()) {
            find.add(matcher.group());
        }
        int iNum = 0, iDenHalf = 0;
        String sDen = "", sDenHalf = "";
        if (find.size() == 3) {
            iNum = Integer.parseInt(find.get(0));
            iDenHalf = Integer.parseInt(find.get(1));
            sDen = find.get(2);
            sDenHalf = find.get(1);
        } else if (find.size() == 2) {
            iNum = Integer.parseInt(find.get(0));
            sDen = find.get(1);
        }
        int up1 = Integer.parseInt(sDenHalf + sDen);
        int up = up1 - iDenHalf;
        int down = Integer.parseInt("9".repeat(sDen.length()) + "0".repeat(sDenHalf.length()));
        for (int i = 2; i <= down; i++) {
            if (up % i == 0 && down % i == 0) {
                up = up / i;
                down = down / i;
                i = 1;
            }
        }
        String result = (up + (iNum * down)) + "/" + down;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fractions("0.(6)"));
        System.out.println(fractions("1.(1)"));
        System.out.println(fractions("3.(142857)"));
        System.out.println(fractions("0.19(2367)"));
        System.out.println(fractions("0.1097(3)"));
    }
}
