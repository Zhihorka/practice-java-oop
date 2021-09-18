import java.util.Arrays;

public class PracticeBlock4Task7 {

    public static int reverseCoding(int x) {
        int raz = x;
        int[] arr = new int[Integer.toString(x).length()];
        for (int i = 0; i < Integer.toString(x).length(); i++) {
            arr[i] = raz % 10;
            raz = raz / 10;
        }
        Arrays.sort(arr);
        String all = "";
        for (int i : arr) {
            all += i;
        }
        return x - Integer.parseInt(all);
    }

    public static void main(String[] args) {
        System.out.println(reverseCoding(832));
        System.out.println(reverseCoding(51));
        System.out.println(reverseCoding(7977));
        System.out.println(reverseCoding(1));
        System.out.println(reverseCoding(665));
        System.out.println(reverseCoding(159));
    }
}
