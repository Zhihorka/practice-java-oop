public class PracticeBlock3Task7 {

    public static boolean doesBrickFit(int bHeight, int bWidth, int bDepth, int wHeight, int wWidth) {
        int wSq = wHeight * wWidth;
        if (wSq >= bHeight * bWidth || wSq >= bHeight * bDepth || wSq >= bDepth * bWidth)
            return true;
        return false;
    }


    public static void main(String[] args) {
        System.out.println(doesBrickFit(1, 1, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 1, 1, 1));
        System.out.println(doesBrickFit(1, 2, 2, 1, 1));
    }
}