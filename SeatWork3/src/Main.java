//import java.util.Scanner;
//
//public class Main {
//    static PlayerAndScore[] scoreboard = new PlayerAndScore[2];
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        char response;
//        do {
//            for (int i = 0; i < scoreboard.length; i++) {
//                String plainInput = scan.nextLine();
//                String[] arrayedInput = plainInput.split(",");
//                String name = arrayedInput[0];
//                int score = Integer.parseInt(arrayedInput[1]);
//                scoreboard[i] = new PlayerAndScore(name, score);
//                System.out.println("Add more? yes/no");
//                String wantMore  = scan.nextLine();
//                if(!(wantMore.equals("yes"))){
//                    break;
//                }
//            }
//            for (PlayerAndScore s : scoreboard) {
//                System.out.println(s);
//            }
//            System.out.println("Do you want to add more player? Y/N");
//            response = scan.nextLine().toUpperCase().charAt(0);
//        } while (response == 'Y');
//    }
//}