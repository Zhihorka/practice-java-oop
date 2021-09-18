import java.util.*;


public class PracticeBlock6Task9 {

    public static String isValid(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        Integer n = 0;
        for(int i = 0; i < str.length(); i++){
            if((n = map.get(str.charAt(i))) != null){
                map.put(str.charAt(i), n + 1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }
        Integer min = str.length(), temp = 0;
        int diff_1 = 0, diff_more_1 = 0;
        for (HashMap.Entry e: map.entrySet()) {
            temp = (Integer)(e.getValue());
            if(temp < min){
                min = temp;
            }
        }
        for (HashMap.Entry e: map.entrySet()) {
            temp = (Integer)(e.getValue());
            if(temp > min){
                if(temp - min == 1){
                    diff_1++;
                }else if(temp - min > 1){
                    diff_more_1++;
                }
            }
        }
        if(diff_more_1 > 0){
            return "NO";
        }
        if(diff_1 > 1){
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(isValid("aabbcd"));
        System.out.println(isValid("aabbccddeefghi"));
        System.out.println(isValid("abcdefghhgfedecba"));
    }
}
