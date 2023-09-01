//import java.util.Scanner;
//
//public class backupMain {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String input = scan.nextLine();
//        String[] splittedArray = input.split(",");   //sample: a1,b1 //splittedArray.length = 2
//        for(int i = 0; i < splittedArray.length; i++){ // 0, 1
//            String seatCode = splittedArray[i].toUpperCase(); //0
//            char letter = seatCode.charAt(0);
//            int number = Integer.parseInt(String.valueOf(seatCode.charAt(1)));
//            int columnCoordinate = letter - 'A';
//            int rowCoordinate = number - 1;
//            seats[rowCoordinate][columnCoordinate] = true;
//        }
//
//        char x;
//        for( int i = 0; i < 4;i++){
//            for ( int j = 0; j < 10; j++){
//                if(!(seats[i][j])){
//                    x = ' ';
//                }
//                else{
//                    x = 'x';
//                }
//                System.out.print("| " + x + " ");
//            }
//            System.out.print("|");
//            System.out.println();
//        }
////        System.out.println("coordinate is " + row + ',' + column);
////        System.out.println(input + " seat is reserved: " + seats[row][column]);
//
//    }
//}
//}
