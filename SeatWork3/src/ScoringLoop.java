import java.util.Scanner;
public class ScoringLoop {
   private final static PlayerAndScore[] SCOREBOARD = new PlayerAndScore[3];

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("To stop score inputs, enter the word [stop]");
        int i = 0;
        try {
            while (true) {
                String input = scan.nextLine();
                String[] nameAndScore = input.split(",");
                if (input.equals("stop")) {
                    break;
                }
                String name = nameAndScore[0];
                int score = Integer.parseInt(nameAndScore[1]);
                SCOREBOARD[i] = new PlayerAndScore(name, score);
                i++;
                if (i > SCOREBOARD.length - 1) {
                    i = 0;
                }
            }
        }catch (Exception e){
            throw new Exception("Input format should be: name,score");
        }
       ScoreboardPrinter.printScoreboard(SCOREBOARD);
    }
}
