public class PracticeBlock3Task5 {

    public static String reverseCase(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c))
                newStr += Character.toLowerCase(c);
            else
                newStr += Character.toUpperCase(c);
        }
        return newStr;
    }


    public static void main(String[] args) {
        System.out.println(reverseCase("Happy Birthday"));
        System.out.println(reverseCase("MANY THANKS"));
        System.out.println(reverseCase("sPoNtAnEoUs"));
    }
}