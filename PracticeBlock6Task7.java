public class PracticeBlock6Task7 {

    public static String pilish_string(String str){
        if(str.equals("")){
            return "";
        }
        String pi = "314159265358979";
        int length;
        StringBuilder result = new StringBuilder();
        for(int i = 0; pi.length() != 0 && i < str.length(); i += length){
            length = Integer.parseInt(pi.substring(0, 1));
            pi = pi.substring(1);
            if(i + length >= str.length()){
                result.append(str.substring(i));
                char ch = result.charAt(result.length() - 1);
                for(int j = 0; j < i + length - str.length(); j++){
                    result.append(ch);
                }
                result.append(" ");
            }
            else {
                result.append(str.substring(i, i + length) + " ");
            }
        }
        return result.substring(0, result.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(pilish_string("33314444"));
        System.out.println(pilish_string("TOP"));
        System.out.println(pilish_string("X"));
    }
}
