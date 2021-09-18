import java.util.Locale;
import java.util.HashMap;

public class PracticeBlock4Task8 {

    public static char commonLastVowel(String str){
        str = str.toLowerCase(Locale.ROOT);
        HashMap<Character, Integer> mapVowel = new HashMap<>();
        char[] Vowel = {'a','e','i','o','u','y'};
        for (int i = 0; i < Vowel.length; i++)
            mapVowel.put(Vowel[i], 0);
        String[] arr = str.split(" ");
        for (String arrElement : arr) {
            for (Character mapElement : mapVowel.keySet())
                if (arrElement.charAt(arrElement.length()-1) == mapElement)
                    mapVowel.put(mapElement, mapVowel.get(mapElement) + 1);
        }
        char maxChar = 'a';
        int max = mapVowel.get('a');
        for (Character element : mapVowel.keySet()) {
            int cur = mapVowel.get(element);
            if (max < cur) {
                max = cur;
                maxChar = element;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(commonLastVowel("Hello World!"));
        System.out.println(commonLastVowel("Watch the characters dance!"));
        System.out.println(commonLastVowel("OOI UUI EEI AAI"));
    }
}
