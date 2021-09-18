public class PracticeBlock3Task8 {

    public static double totalDistance(double fuel, double fuelCon, int pas, boolean cond) {
        double baseCon = fuelCon;
        if (pas > 0)
            baseCon =baseCon * (1.0 + (pas*0.05));
        if (cond)
            baseCon = baseCon * 1.1;
        return (fuel * 100 / baseCon);
    }

    public static void main(String[] args) {
        System.out.println(totalDistance(70.0, 7.0, 0, false));
        System.out.println(totalDistance(36.1, 8.6, 3, true));
        System.out.println(totalDistance(55.5, 5.5, 5, false));
    }
}
