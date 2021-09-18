import java.util.*;

public class practiceBlock6Task2 {

    public static ArrayList<String> collect(String str, int len) {
        if (len >= str.length())
            return new ArrayList<String>();
        StringBuilder work = new StringBuilder(str);
        String midResult = work.substring(0, len);
        ArrayList<String> result;
        result = collect(work.substring(len, str.length()), len);
        result.add(midResult);
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(collect("intercontinentalisationalism", 6));
        System.out.println(collect("strengths", 3));
        System.out.println(collect("pneumonoultramicroscopicsilicovolcanoconiosis", 15));
    }
}
