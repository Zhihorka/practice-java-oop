public class PracticeBlock2Task9 {


    static void bomb(String line) {
        int intIndex = line.toLowerCase().indexOf("bomb");
        if (intIndex == -1) {
            System.out.println("Relax, there's no bomb.");
        } else {
            System.out.println("DUCK!");
        }
    }


    public static void main(String[] args) {
        bomb("This goes boom!!!");
    }
}