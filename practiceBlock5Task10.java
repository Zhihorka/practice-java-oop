import java.util.*;

public class practiceBlock5Task10 {

    public static boolean isNew(int inp){
        int x = inp;
        int len = Integer.toString(x).length();
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--){
            arr[i] = x % 10;
            x = x / 10;
        }
        Arrays.sort(arr);
        if (arr[0] == 0){
            for (int i =1; i < len; i++) {
                if (arr[i] != 0){
                    arr[0] = arr[i];
                    arr[i] = 0;
                }
            }
        }
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < len; i++) {
            out.append(arr[i]);
        }
        return Integer.parseInt(out.toString()) == inp;
    }

    public static void main(String[] args) {
        System.out.println(isNew(3) );
        System.out.println(isNew(30) );
        System.out.println(isNew(321) );
        System.out.println(isNew(123) );
    }
}
