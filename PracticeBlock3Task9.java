public class PracticeBlock3Task9 {

    public static double mean(int[] arr){
        double total = 0;
        for (int i = 0; i < arr.length; i++)
            total += arr[i];
        return total / arr.length;
    }

    public static void main(String[] args) {
        int[][] avg = {{1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}, {2, 3, 2, 3}, {3, 3, 3, 3, 3}};
        System.out.println(mean(avg[0]));
        System.out.println(mean(avg[1]));
        System.out.println(mean(avg[2]));
    }
}
