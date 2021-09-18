public class PracticeBlock3Task6 {

    public static String inatorInator(String str) {
        String consonantsEnglish = "qwrtplkjhgfdszxcvbnm";
        int strLength = str.length();
        if (consonantsEnglish.indexOf(Character.toLowerCase(str.charAt(strLength - 1))) == -1)
            str += "-inator";
        else
            str += "inator";
        str += " " + strLength + "000";
        return str;
    }


    public static void main(String[] args) {
        System.out.println(inatorInator("Shrink"));
        System.out.println(inatorInator("Doom"));
        System.out.println(inatorInator("EvilClone"));
    }
}