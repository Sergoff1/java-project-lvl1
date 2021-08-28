package hexlet.code;

// CHECKSTYLE IGNORE check FOR NEXT 1 LINES
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] gamesNumbers = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression"};
        for (int i = 1; i < gamesNumbers.length; i++) {
            System.out.println(i + " - " + gamesNumbers[i]);
        }
        System.out.println("0 - " + gamesNumbers[0]);

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int selectedGame = sc.nextInt();
        System.out.println();
        Game game = null;

        // CHECKSTYLE IGNORE check FOR NEXT 8 LINES
        switch (selectedGame) {
            case 1 -> Cli.greet();
            case 2 -> game = new Even();
            case 3 -> game = new Calc();
            case 4 -> game = new GCD();
            case 5 -> game = new Progression();
            default -> System.exit(0);
        }

        if (game != null) {
            Engine.start(game);
        }
    }
}
