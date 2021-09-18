public class PracticeBlock1Task7 {

    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }

    public static void main(String[] args) {
        System.out.println(profitableGamble(0.9, 1, 2));
    }
}