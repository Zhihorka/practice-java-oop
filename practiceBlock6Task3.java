import java.util.*;

public class practiceBlock6Task3 {

    public static void swapColumns(char[][] charr, int from, int to){
        char temp;
        for(int i = 0; i < charr.length; i++){
            temp = charr[i][from];
            charr[i][from] = charr[i][to];
            charr[i][to] = temp;
        }
    }
    public static String nicoCipher(String message, String key) {
        int keyLength = key.length();
        int rows = (int) Math.ceil(((double) message.length() / keyLength));
        char[][] arr = new char[rows][keyLength];
        int si = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++, si++) {
                arr[i][j] = si < message.length() ? message.charAt(si) : ' ';
            }
        }

        char[] arrKey = key.toCharArray();
        Arrays.sort(arrKey);
        String sortedKey = "";
        for (int i = 0; i < arrKey.length; i++) {
            sortedKey += arrKey[i];
        }

        int[] sortNumKey = new int[key.length()];
        for (int i = 0; i < sortNumKey.length; i++) {
            sortNumKey[i] = sortedKey.indexOf(key.charAt(i));
            sortedKey = sortedKey.replaceFirst("" + key.charAt(i), "|");
        }

        int temp;
        for (int i = sortNumKey.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (sortNumKey[j] > sortNumKey[j + 1]) {
                    temp = sortNumKey[j];
                    sortNumKey[j] = sortNumKey[j + 1];
                    sortNumKey[j + 1] = temp;
                    swapColumns(arr, j, j + 1);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result.append(arr[i][j]);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(nicoCipher("myworldevolvesinhers", "tesh"));
        System.out.println(nicoCipher("andiloveherso", "tesha"));
        System.out.println(nicoCipher("mubashirhassan", "crazy"));
        System.out.println(nicoCipher("edabitisamazing", "matt"));
        System.out.println(nicoCipher("iloveher", "612345"));
    }
}
