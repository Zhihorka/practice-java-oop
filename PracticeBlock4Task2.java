import java.util.Arrays;

public class PracticeBlock4Task2 {

    public static boolean cons(int[] arr){
        Arrays.sort(arr);
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int j = arr[i];
            if (x == j - 1)
                x = j;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arrCons = {{5, 1, 4, 3, 2},{5, 1, 4, 3, 2, 8},{5, 6, 7, 8, 9, 9}};
        System.out.println(cons(arrCons[0]));
        System.out.println(cons(arrCons[1]));
        System.out.println(cons(arrCons[2]));
    }
}
