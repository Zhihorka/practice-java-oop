public class PracticeBlock1Task9 {

    public static int frames(int minutes, int fps) {
        return minutes * fps * 60;
    }

    public static void main(String[] args) {
        System.out.println(frames(1, 1));
        System.out.println(frames(10, 1));
        System.out.println(frames(10, 25));
    }

}
