public class PracticeBlock4Task9 {

    public static int memeSum(int x, int y){
        int len = 1;
        if (Integer.toString(x).length() > Integer.toString(y).length())
            len = Integer.toString(x).length();
        else
            len = Integer.toString(y).length();
        int[][] findSum = new int[3][len];
        int i = 0;
        while (x != 0){
            findSum[0][i] = x % 10;
            x = x /10;
            i++;
        }
        i = 0;
        while (y != 0){
            findSum[1][i] = y % 10;
            y = y /10;
            i++;
        }
        for (i = 0; i < len; i++) {
            findSum[2][i] = findSum[0][i] + findSum[1][i];
        }
        String Ans = "";
        for (i = len -  1; i >= 0; i--){
            Ans += findSum[2][i];
        }
        return Integer.parseInt(Ans);
    }

    public static void main(String[] args) {
        System.out.println(memeSum(26,39));
        System.out.println(memeSum(122,81));
        System.out.println(memeSum(1222,30277));
    }
}
