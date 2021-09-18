public class PracticeBlock4Task1 {

    public static String sevenBoom(final int[] arr){
        for (int el : arr) {
            while (el != 0) {
                if (el % 10 == 7)
                    return "Boom";
                el = el/ 10;
            }
        }
        return "There is no 7 in the array";
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6,7}, {8, 6, 33, 100},{2, 55, 60, 97, 86}};
        System.out.println(sevenBoom(arr[0]));
        System.out.println(sevenBoom(arr[1]));
        System.out.println(sevenBoom(arr[2]));
    }
}
