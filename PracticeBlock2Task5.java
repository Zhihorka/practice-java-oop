public class PracticeBlock2Task5 {

    static int equal(int a, int b, int c) {
        int[] data = {a, b, c};
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == (data[j])) {
                    counter++;
                }
            }
        }
        if (counter == 3) {
            return 3;
        } else if (counter == 1) {
            return 2;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        System.out.println(equal(3, 3, 3));
    }
}
