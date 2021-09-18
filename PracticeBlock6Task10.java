import java.util.*;

public class PracticeBlock6Task10 {

    public static ArrayList<ArrayList<Integer>> sumsUp(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 8) {
                    ArrayList<Integer> add = new ArrayList<>();
                    add.add(arr[i]);
                    add.add(arr[j]);
                    Collections.sort(add);
                    result.add(add);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumsUp(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sumsUp(new int[]{1, 2, 3, 7, 9}));
        System.out.println(sumsUp(new int[]{10, 9, 7, 2, 8}));
        System.out.println(sumsUp(new int[]{1, 6, 5, 4, 8, 2, 3, 7}));
    }
}
