package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] gamesNumbers = {"Greet", "Even", "Exit"};
        for (int i = 0; i < gamesNumbers.length - 1; i++) {
            System.out.println(i + 1 + " - " + gamesNumbers[i]);
        }
        System.out.println("0 - " + gamesNumbers[gamesNumbers.length - 1]);

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gamesNumber = sc.nextInt();
        System.out.println();

        switch (gamesNumber) {
            case 1 -> Cli.greet();
            case 2 -> Even.startGame();
            default -> System.exit(0);
        }

    }
}
