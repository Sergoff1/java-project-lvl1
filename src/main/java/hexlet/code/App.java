package hexlet.code;

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
        System.out.println();

        switch (selectedGame) {
            case 1 -> Cli.greet();
            case 2 -> Engine.start("Even");
            case 3 -> Engine.start("Calc");
            case 4 -> Engine.start("GCD");
            case 5 -> Engine.start("Progression");
            case 6 -> Engine.start("Prime");
            default -> System.exit(0);
        }

    }
}
