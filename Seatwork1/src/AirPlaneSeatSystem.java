import java.util.Scanner;

public abstract class AirPlaneSeatSystem {
   private final static boolean[][] SEATS = new boolean[4][10];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] allSeatCodes = input.split(",");   //sample: a1,b1 //allSeatCodes.length = 2
        for (String s : allSeatCodes) { // 0, 1
            String seatCode = s.toUpperCase(); //0
            SeatManager.findSeatAndBook(seatCode, SEATS);
        }
        SeatPrinter.printAllSeats(SEATS);
    }
}