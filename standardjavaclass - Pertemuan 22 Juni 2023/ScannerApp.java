package standardjavaclass;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        System.out.println("What is my nickname");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if (answer.equals("agus") || answer.equals("Agus")) {
            System.out.println("You are right");
        } else {
            System.out.println("Wrong! Try again");
        }
    }
}
