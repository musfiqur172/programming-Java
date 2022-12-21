import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for (int i = 5; i > 0; i--){
//            System.out.println("Hello World " + i);
//        }
//        int i = 0;
//        while (i > 0) {
//            System.out.println("Hello World " + i);
//            i--;
//        }
        Scanner scanner = new Scanner(System.in);

        String input = "";
        while(!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next();
            System.out.println(input);
        }
    }
}