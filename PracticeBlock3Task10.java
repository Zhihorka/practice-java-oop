public class PracticeBlock3Task10 {

    public static boolean parityAnalysis(int x) {
        int sum = 0;
        int y = x;
        while (x > 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum % 2 == y % 2;

    }

    public static void main(String[] args) {
        System.out.println(parityAnalysis(243));
        System.out.println(parityAnalysis(12));
        System.out.println(parityAnalysis(3));
    }
}
