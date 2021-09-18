public class PracticeBlock2Task10 {

    static boolean sameAscii(String first, String second) {
        int asciiValueOfFirst = 0;
        int asciiValueOfSecond = 0;
        for (int i = 0; i < first.length(); i++) {
            int asciiValue = first.charAt(i);
            asciiValueOfFirst = asciiValueOfFirst + asciiValue;
        }
        for (int i = 0; i < second.length(); i++) {
            int asciiValue = second.charAt(i);
            asciiValueOfSecond = asciiValueOfSecond + asciiValue;
        }
        if (asciiValueOfFirst == asciiValueOfSecond) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(sameAscii("EdAbIt", "EDABIT"));
    }
}