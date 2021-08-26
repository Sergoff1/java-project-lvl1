package hexlet.code;

import hexlet.code.games.Game;
import java.util.Scanner;

public class Engine {
    static final int ROUNDS_NUMBER = 3;

    static void start(Game game) {
        String playerName = Cli.greet();
        System.out.println(game.getDescription());

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            String question = game.getQuestion();
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = sc.next();

            if (game.getCorrectAnswer(question).equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + game.getCorrectAnswer(question) + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }

}
