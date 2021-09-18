import java.util.Arrays;

public class PracticeBlock2Task3 {

    static int differenceMaxMin(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] - numbers[0];
    }

    public static void main(String[] args) {
        int[] data = {6, -1, -2, -3, 0, 1, 2, 3, 4};
        System.out.println(differenceMaxMin(data));
    }
}