package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_NUMBER = 3;

    static void start(String game) {
        String playerName = Cli.greet();

        switch (game) {
            case Even.NAME:
                System.out.println(Even.getDescription());
                break;
            case Calc.NAME:
                System.out.println(Calc.getDescription());
                break;
            case GCD.NAME:
                System.out.println(GCD.getDescription());
                break;
            case Progression.NAME:
                System.out.println(Progression.getDescription());
                break;
            case Prime.NAME:
                System.out.println(Prime.getDescription());
                break;
            default:
                return;
        }

        Scanner sc = new Scanner(System.in);

        String[][] questionsAndAnswers = getQuestionsAndAnswers(game);
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

    public static String[][] getQuestionsAndAnswers(String game) {
        String[][] questionAndAnswers = new String[Engine.ROUNDS_NUMBER][0];

        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            switch (game) {
                case Even.NAME:
                    questionAndAnswers[i] = Even.getQuestionAndAnswer();
                    break;
                case Calc.NAME:
                    questionAndAnswers[i] = Calc.getQuestionAndAnswer();
                    break;
                case GCD.NAME:
                    questionAndAnswers[i] = GCD.getQuestionAndAnswer();
                    break;
                case Progression.NAME:
                    questionAndAnswers[i] = Progression.getQuestionAndAnswer();
                    break;
                case Prime.NAME:
                    questionAndAnswers[i] = Prime.getQuestionAndAnswer();
                    break;
                default:
                    break;
            }
        }

        return questionAndAnswers;
    }

}
