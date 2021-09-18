public class PracticeBlock2Task6 {

    static String reverse(String text) {
        String viceVersa = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            viceVersa = viceVersa + text.charAt(i);
        }
        return viceVersa;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello World"));
    }
}