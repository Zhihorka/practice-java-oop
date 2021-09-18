public class PracticeBlock2Task2 {

    static double discount(int price, int discount) {
        return price * discount / 100;
    }

    public static void main(String[] args) {
        System.out.println(discount(1500, 50));

    }
}
