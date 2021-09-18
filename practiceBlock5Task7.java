import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class practiceBlock5Task7 {

    public static String rearrange(String str){
        StringBuilder resStr = new StringBuilder();
        String[] arr = str.split(" ");
        Pattern pattern = Pattern.compile("\\d");
        int[] s = new int[arr.length];
        int i = 0;
        for (String word: arr){
            Matcher m = pattern.matcher(word);
            while (m.find()){
                s[i] = Integer.parseInt(m.group()) - 1;
                arr[i] = arr[i].replace(m.group(), "");
            }
            i++;
        }
        String[] resArr = new String[arr.length];
        for (int k = 0; k < arr.length; k++) {
            resArr[s[k]] = arr[k];
        }
        for (String t:resArr) {
            resStr.append(t + " ");
        }
        return resStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s.") );
        System.out.println(rearrange("the4 t3o man5 Happ1iest of6 no7 birt2hday steel8!") );
        System.out.println(rearrange("is2 Thi1s T4est 3a") );
        System.out.println(rearrange("4of Fo1r pe6ople g3ood th5e the2") );
        System.out.println(rearrange(" ") );
    }
}
