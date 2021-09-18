public class PracticeBlock1Task6 {


    static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }


    public static void main(String[] args) {
        System.out.println(howManyWalls(100, 4, 5));
    }
}