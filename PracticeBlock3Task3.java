public class PracticeBlock3Task3 {


    public static String rps(String pl1, String pl2) {
        if (pl1 == "rock") {
            if (pl2 == "rock") return "Tie";
            if (pl2 == "paper") return "Player 2 wins";
            if (pl2 == "scissors") return "Player 1 wins";
        }
        if (pl1 == "paper") {
            if (pl2 == "rock") return "Player 1 wins";
            if (pl2 == "paper") return "Tie";
            if (pl2 == "scissors") return "Player 2 wins";
        }
        if (pl1 == "scissors") {
            if (pl2 == "rock") return "Player 2 wins";
            if (pl2 == "paper") return "Player 1 wins";
            if (pl2 == "scissors") return "Tie";
        }
        return "Tie";
    }


    public static void main(String[] args) {
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("scissors", "paper"));
    }
}