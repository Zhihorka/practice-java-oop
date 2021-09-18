

public class PracticeBlock2Task8 {


    static boolean getXO(String row) {
        row.toLowerCase();
        int Ocounter = 0;
        int Xcounter = 0;
        for (int i = 0; i < row.length(); i++) {
            String c = String.valueOf(row.charAt(i));
            if (c == "o") {
                Ocounter++;
                System.out.println("o spotted");
            } else if (c == "x") {
                Xcounter++;
                System.out.println("х spotted");
            }
        }
        if (Ocounter == Xcounter) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
    }
}