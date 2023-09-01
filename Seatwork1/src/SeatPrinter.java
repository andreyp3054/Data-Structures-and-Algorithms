public class SeatPrinter {
    public static void printAllSeats(boolean[][] SEATS){
        char x;
        for( int i = 0; i < 4;i++){
            for ( int j = 0; j < 10; j++){
                if(!(SEATS[i][j])){
                    x = ' ';
                }
                else{
                    x = 'x';
                }
                System.out.print("| " + x + " ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
}
