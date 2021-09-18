import java.util.regex.Pattern;
import java.util.*;

public class practiceBlock5Task4 {

    public static int totalPoints(String[] arr, String answer){
        String patternString = "[" + answer + "]*";
        int allPoints = 0;
        for (String word: arr){
            if (Pattern.matches(patternString, word)){
                boolean skip = false;
                char[] cWord = word.toCharArray();
                Arrays.sort(cWord);
                char[] cAnswer = answer.toCharArray();
                Arrays.sort(cAnswer);
                for (int i = 0; i < word.length(); i++){
                    for (int j = 0; j < answer.length(); j++){
                        if (cWord[i] == cAnswer[j]){
                            cAnswer[i] = '\0';
                            break;
                        }
                        if (j == answer.length() - 1) {skip = true; break;
                        }
                    }

                }
                if (!skip) {
                    switch (word.length()) {
                        case 3: {allPoints++;break;}
                        case 4: {allPoints += 2;break;}
                        case 5: {allPoints += 3;break;}
                        case 6: {allPoints += 54;break;}
                    }
                }
            }
        }
        Pattern p = Pattern.compile(patternString);
        return allPoints;
    }

    public static void main(String[] args) {
        String [][] arr = {{"cat", "create", "sat"}, {"trance", "recant"}, {"dote", "dotes", "toes", "set", "dot", "dots", "sted"} };
        System.out.println(totalPoints(arr[0], "caster") );
        System.out.println(totalPoints(arr[1], "recant") );
        System.out.println(totalPoints(arr[2], "tossed") );
    }
}
