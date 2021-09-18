import java.util.HashMap;
import java.util.Locale;

public class PracticeBlock4Task10 {

    public static String unrepeated(String str){
        HashMap<Character, Boolean> map = new HashMap<>();
        str = str.toLowerCase(Locale.ROOT);
        String out = "";
        for (int i = 0; i < str.length(); i++){
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), true);
                out += str.charAt(i);
            }
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(unrepeated("teshahset"));
        System.out.println(unrepeated("hello"));
        System.out.println(unrepeated("aaaaa"));
        System.out.println(unrepeated("WWE!!!"));
        System.out.println(unrepeated("call 911"));
    }
}
