public class practiceBlock5Task3 {

    public static int digitsCount(long inp, int count) {
        if (inp / 10 == 0)
            return count + 1;
        else
            return digitsCount(inp / 10, count + 1);
    }

    public static void main(String[] args) {
        System.out.println(digitsCount(4666, 0));
        System.out.println(digitsCount(544, 0));
        System.out.println(digitsCount(121317, 0));
        System.out.println(digitsCount(0, 0));
        System.out.println(digitsCount(12345, 0));
        System.out.println(digitsCount(1289396387328L, 0));
    }
}
