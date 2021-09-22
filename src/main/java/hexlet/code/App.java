package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] gamesNumbers = {"Exit", "Greet", "Even", "Calc", "GCD", "Progression", "Prime"};
        for (int i = 1; i < gamesNumbers.length; i++) {
            System.out.println(i + " - " + gamesNumbers[i]);
        }
        System.out.println("0 - " + gamesNumbers[0]);

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int selectedGame = sc.nextInt();

        switch (gamesNumbers[selectedGame]) {
            case Even.NAME:
                Even.start();
                break;
            case Calc.NAME:
                Calc.start();
                break;
            case GCD.NAME:
                GCD.start();
                break;
            case Progression.NAME:
                Progression.start();
                break;
            case Prime.NAME:
                Prime.start();
                break;
            case "Greet":
                Cli.greet();
            default:
                System.exit(0);
        }
    }
}
