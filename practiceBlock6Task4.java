import java.util.*;

public class practiceBlock6Task4 {

    public static ArrayList<Integer> twoProduct(int[] arr, int n) {
        int higher = -1;
        int lowest = -1;
        int largestGap = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] * arr[j] == n) {
                        if (largestGap > j - i) {
                            lowest = i;
                            higher = j;
                            largestGap = higher - lowest;
                        }
                    }
                }
            }
        }
        if (higher == -1 || lowest == -1)
            return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[lowest]);
        result.add(arr[higher]);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(twoProduct(new int[]{1, 2, 3, 9, 4, 5, 15}, 45));
        System.out.println(twoProduct(new int[]{1, 2, 3, 9, 4, 15, 5}, 45));
        System.out.println(twoProduct(new int[]{1, 2, -1, 4, 5, 6, 10, 7}, 20));
        System.out.println(twoProduct(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
        System.out.println(twoProduct(new int[]{100, 12, 4, 1, 2}, 15));
    }
}
