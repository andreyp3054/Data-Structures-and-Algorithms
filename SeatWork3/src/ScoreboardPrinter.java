public class ScoreboardPrinter {
    public static void printScoreboard(PlayerAndScore[] scoreboard){
        for(PlayerAndScore s: scoreboard){
            System.out.print("| " + s);
        }
        System.out.print(" |");
    }
}
