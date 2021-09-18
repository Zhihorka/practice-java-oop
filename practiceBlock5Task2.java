public class practiceBlock5Task2 {

    public static class Spiderweb {
        private String spiderPosition;
        private String flyPosition;
        private char sPs;
        private int sPn;
        private char fPs;
        private int fPn;
        private int webLength = 10;
        private int webAngle = 45;
        private StringBuilder path;
        public Spiderweb() {
            setSpiderPosition("A0");
            setFlyPosition("A0");
            path = new StringBuilder();
        }
        public Spiderweb(String sP, String fP) {
            setSpiderPosition(sP);
            setFlyPosition(fP);
            path = new StringBuilder();
        }
        void setSpiderPosition(String x) {
            spiderPosition = x;
            sPs = x.charAt(0);
            sPn = Character.getNumericValue(x.charAt(1));
        }
        void setFlyPosition(String x) {
            flyPosition = x;
            fPs = x.charAt(0);
            fPn = Character.getNumericValue(x.charAt(1));
        }
        String getSpiderPosition() { return spiderPosition; }
        String findPath() {
            path.append(getSpiderPosition() + "-");
            do {
                if (Math.abs((sPs - fPs)) <= 2 && sPn == fPn) {
                    while ((sPs != fPs)) {
                        if (sPs < fPs) {
                            sPs = (char) (sPs + 1);
                        } else {
                            sPs = (char) (sPs - 1);
                        }
                        path.append(Character.toString(sPs) + sPn + "-");
                    }
                } else if (sPs == 'A' && fPs == 'H' || sPs == 'H' && fPs == 'A') {
                    sPs = fPs;
                    path.append(Character.toString(sPs) + sPn + "-");
                } else if (sPs == 'A' && fPs == 'G' || sPs == 'G' && fPs == 'A') {
                    sPs = 'H';
                    path.append(Character.toString(sPs) + sPn + "-");
                } else {
                    if ((sPs != fPs) && sPn > 0)
                        sPn = sPn - 1;
                    if (sPn == 0) {
                        path.append("A0-");
                        sPs = fPs;
                    }
                    if (sPs == fPs)
                        sPn = sPn + 1;
                    path.append(Character.toString(sPs) + sPn + "-");
                }
            } while ((sPs != fPs) || sPn != fPn);
            return path.toString();
        }
    }

    public static String spiderVsFly(String spider, String fly) {
        Spiderweb spiderweb = new Spiderweb(spider, fly);
        return spiderweb.findPath();
    }

    public static void main(String[] args) {
        System.out.println(spiderVsFly("H3", "E2"));
        System.out.println(spiderVsFly("A4", "B2"));
        System.out.println(spiderVsFly("A4", "C2"));
    }
}
