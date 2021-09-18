public class PracticeBlock1Task4 {


    static boolean divisibleByFive(int number) {
        if (number % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(divisibleByFive(-53));

    }
}