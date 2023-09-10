import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InfiniteArray<Integer> InfiniteObject = new InfiniteArray<>(3);
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------INFINITE ARRAY SIMULATION-----------------");
        System.out.println("Note: Input [n] or [N] to terminate program.");
        System.out.println("Input any integer value");
        while(true) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("n")) {
                System.out.println(InfiniteObject);
                break;
            }
            int numberInput = Integer.parseInt(input);
            InfiniteObject.add(numberInput);
        }
    }
}
