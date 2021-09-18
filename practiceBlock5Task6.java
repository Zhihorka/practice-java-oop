import java.util.*;

public class practiceBlock5Task6 {

    public static String takeDownAverage(int[] arr){
        int sum = Arrays.stream(arr).sum();
        int len = arr.length;
        int x = 0;
        x = (int)((((sum * len) + sum) - (5 * len * len + 5 * len) - (sum * len)) / len);
        return String.format("%d", x);
    }

    public static void main(String[] args) {
        int [][] fArr = {{95,83,90,87,88,93}, {10}, {53, 79}};
        System.out.println(takeDownAverage(fArr[0]));
        System.out.println(takeDownAverage(fArr[1]));
        System.out.println(takeDownAverage(fArr[2]));
    }
}
