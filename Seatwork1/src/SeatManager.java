public class SeatManager {
       public static void findSeatAndBook(String seatCode, boolean[][] seats){
           char letter = seatCode.charAt(0);
           int number = Integer.parseInt(String.valueOf(seatCode.charAt(1)));
           int column = letter - 'A';
           int row = number - 1;
            seats[row][column] = true;
        }
}
