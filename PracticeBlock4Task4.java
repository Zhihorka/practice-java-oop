public class PracticeBlock4Task4 {

    public static String noYelling(String inp) {
        String res = "";
        int num = 0;
        char eqChar = 0;
        for (int i = 0; i < inp.length(); i++) {
            if ((inp.charAt(i) == '!' && eqChar != '!') || (inp.charAt(i) == '?' && eqChar != '?')) {
                eqChar = inp.charAt(i);
                num = i;
            }
            if (inp.charAt(i) != '!' && inp.charAt(i) != '?') {
                eqChar = 0;
                num = 0;
            }

        }
        if (num != 0) {
            res = inp.substring(0, num + 1);
            return res;
        }
        return inp;
    }

    public static void main(String[] args) {
        System.out.println(noYelling("What went wrong?????????"));
        System.out.println(noYelling("Oh my goodness!!!"));
        System.out.println(noYelling("I just!!! can!!! not!!! believe!!! it!!!"));
        System.out.println(noYelling("Oh my goodness!"));
        System.out.println(noYelling("I just cannot believe it."));
    }
}
