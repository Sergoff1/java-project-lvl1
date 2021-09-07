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

        String gameDescription = "";
        String[][] questionAndAnswers = new String[Engine.ROUNDS_NUMBER][0];

        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            switch (gamesNumbers[selectedGame]) {
                case Even.NAME:
                    questionAndAnswers[i] = Even.getQuestionAndAnswer();
                    gameDescription = Even.getDescription();
                    break;
                case Calc.NAME:
                    questionAndAnswers[i] = Calc.getQuestionAndAnswer();
                    gameDescription = Calc.getDescription();
                    break;
                case GCD.NAME:
                    questionAndAnswers[i] = GCD.getQuestionAndAnswer();
                    gameDescription = GCD.getDescription();
                    break;
                case Progression.NAME:
                    questionAndAnswers[i] = Progression.getQuestionAndAnswer();
                    gameDescription = Progression.getDescription();
                    break;
                case Prime.NAME:
                    questionAndAnswers[i] = Prime.getQuestionAndAnswer();
                    gameDescription = Prime.getDescription();
                    break;
                case "Greet":
                    Cli.greet();
                default:
                    System.exit(0);
            }
        }

        Engine.start(questionAndAnswers, gameDescription);
    }
}
