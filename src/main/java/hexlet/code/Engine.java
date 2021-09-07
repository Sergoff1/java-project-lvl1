package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    static void start(String[][] questionsAndAnswers, String gameDescription) {
        String playerName = Cli.greet();

        System.out.println(gameDescription);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String answer = sc.next();

            if (questionsAndAnswers[i][1].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }

    public static int getRandomNumberUpTo(int number) {
        return (int) (Math.random() * number);
    }
}
