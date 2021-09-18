public class practiceBlock6Task5 {

    public static int isExact(int num, int n) {
        if (num % n == 0) {
            if (num / n == 1) {
                return n;
            } else {
                return isExact(num / n, n + 1);
            }
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(isExact(6, 1));
        System.out.println(isExact(24, 1));
        System.out.println(isExact(125, 1));
        System.out.println(isExact(720, 1));
        System.out.println(isExact(1024, 1));
        System.out.println(isExact(40320, 1));
    }
}
