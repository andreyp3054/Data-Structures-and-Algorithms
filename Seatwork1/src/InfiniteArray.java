import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] initialArray = new String[5];
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(true){
        String acceptor = scan.nextLine();
            if(acceptor.equals("n")){
                break;
            }
            if(i == initialArray.length-1){
                String[] newArray = new String[i+2];
                for(int j = 0; j < newArray.length-1; j++){
                    newArray[j] = initialArray[j];
                }
            }
            initialArray[i] = acceptor;
            i++;
        }
    }
}
//        int i = 0;
//        while (true) {
//            String x = input.nextLine();
//            if (x.equals("n")) {
//                break;
//            }
//            initialArray[i] = x;
//            i++;
//        }
//}
//}
//(if initialArray[initialArray.length-1] == null){
//    String[] biggerArray = new String[initialArray.length + 1]
////}//

