public class PracticeBlock3Task4 {

    public static int warOfNumbers(int[] num) {
        int ch = 0, nch = 0;
        for (int number : num) {
            if (number % 2 == 0)
                ch += number;
            else
                nch += number;
        }
        return Math.abs(ch - nch);
    }


    public static void main(String[] args) {
        int[][] numbers = {{2, 8, 7, 5}, {12, 90, 75}, {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}};
        System.out.println(warOfNumbers(numbers[0]));
        System.out.println(warOfNumbers(numbers[1]));
        System.out.println(warOfNumbers(numbers[2]));
    }
}