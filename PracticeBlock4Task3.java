public class PracticeBlock4Task3 {

    public static String unmix(String inp){
        String res = "";
        for (int i = 0; i < inp.length(); i+=2){
            if (i+1 < inp.length())
                res += inp.charAt(i+1);
            res += inp.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(unmix("123456"));
        System.out.println(unmix("hTsii  s aimex dpus rtni.g"));
        System.out.println(unmix("badce"));
    }
}
