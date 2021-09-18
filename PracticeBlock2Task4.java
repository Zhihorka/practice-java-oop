import java.util.Arrays;

public class PracticeBlock2Task4 {

    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0];
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 4, 1, 4, -10, -50, 32, 21};
        int[] arr2 = {44, 32, 86, 19};
        System.out.println("Разница между max и min в [10, 4, 1, 4, -10, -50, 32, 21]: " + differenceMaxMin(arr1));
        System.out.println("Разница между max и min в [44, 32, 86, 19]: " + differenceMaxMin(arr2));
    }
}
