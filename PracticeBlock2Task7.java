import java.util.Arrays;

public class PracticeBlock2Task7 {


    static int programmers(int first, int second, int third) {
        int[] salaries = {first, second, third};
        Arrays.sort(salaries);
        return salaries[salaries.length - 1] - salaries[0];
    }

    public static void main(String[] args) {
        System.out.println(programmers(147, 33, 526));
    }
}