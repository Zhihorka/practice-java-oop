public class PracticeBlock6Task8 {

    public static String generateNonconsecutive(int n) {
        StringBuilder result = new StringBuilder("0".repeat(n) + " ");
        for (int i = 1; i <= Math.pow(2, n) - 1; i++) {
            String mid = String.format("%0" + n + "d", Integer.parseInt(Integer.toString(i, 2)));
            if (mid.contains("11"))
                continue;
            result.append(mid + " ");
        }


        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateNonconsecutive(1));
        System.out.println(generateNonconsecutive(2));
        System.out.println(generateNonconsecutive(3));
        System.out.println(generateNonconsecutive(4));
    }
}
