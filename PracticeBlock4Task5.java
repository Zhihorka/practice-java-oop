public class PracticeBlock4Task5 {

    public static String xPronounce(String inp){
        String out = "";
        String[] arr = inp.split(" ");
        for (String word : arr) {
            if (word.equals("x"))
                word = word.replaceAll("x", "ecks");
            if (word.charAt(0) == 'x')
                word = word.replaceFirst("x", "z");
            word = word.replaceAll("x", "cks");
            out += word + " ";
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(xPronounce("Inside the box was a xylophone"));
        System.out.println(xPronounce("The x ray is excellent"));
        System.out.println(xPronounce("OMG x box unboxing video x D"));
    }
}
