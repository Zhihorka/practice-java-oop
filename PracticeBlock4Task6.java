import java.util.Arrays;

public class PracticeBlock4Task6 {

    public static int largestGap(int[] arr){
        Arrays.sort(arr);
        int max = -1;
        for (int i = 0; i < arr.length - 1; i++){
            if (max < arr[i + 1] - arr[i])
                max = arr[i + 1] - arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arrGap = {{9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}, {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7}, {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9}};
        System.out.println(largestGap(arrGap[0]));
        System.out.println(largestGap(arrGap[1]));
        System.out.println(largestGap(arrGap[2]));
    }
}
