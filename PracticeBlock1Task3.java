public class PracticeBlock1Task3 {


    static int footballPoints(int wins, int draws, int defeats) {
        return wins * 3 + draws * 1 + defeats * 0;
    }


    public static void main(String[] args) {

        System.out.println(footballPoints(3, 4, 2));

    }
}
