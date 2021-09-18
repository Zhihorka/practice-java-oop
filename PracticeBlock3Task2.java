import java.util.Arrays;

public class PracticeBlock3Task2 {


    public static double[] otherSides(double x) {
        double[] sides = {2 * x, x * Math.sqrt(3)};
        return sides;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(otherSides(1)));
        System.out.println(Arrays.toString(otherSides(12)));
        System.out.println(Arrays.toString(otherSides(2)));
        System.out.println(Arrays.toString(otherSides(3)));
    }
}