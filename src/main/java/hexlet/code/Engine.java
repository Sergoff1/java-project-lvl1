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

        if (game.equals("Greet")) {
            return;
        }

        switch (game) {
            case "Even":
                System.out.println(Even.getDescription());
                break;
            case "Calc":
                System.out.println(Calc.getDescription());
                break;
            case "GCD":
                System.out.println(GCD.getDescription());
                break;
            case "Progression":
                System.out.println(Progression.getDescription());
                break;
            case "Prime":
                System.out.println(Prime.getDescription());
                break;
            default:
                break;
        }

        Scanner sc = new Scanner(System.in);

        String[][] questionsAndAnswers = getQuestionsAndAnswers(game);
        for (int i = 0; i < ROUNDS_NUMBER; i++) {
            System.out.println("Question: " + questionsAndAnswers[0][i]);
            System.out.print("Your answer: ");
            String answer = sc.next();

            if (questionsAndAnswers[1][i].equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[1][i] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }

    public static String[][] getQuestionsAndAnswers(String game) {
        String[][] questionAndAnswers = new String[Engine.ROUNDS_NUMBER][Engine.ROUNDS_NUMBER];

        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            switch (game) {
                case "Even":
                    questionAndAnswers[0][i] = Even.getQuestion();
                    questionAndAnswers[1][i] = Even.getCorrectAnswer(questionAndAnswers[0][i]);
                    break;
                case "Calc":
                    questionAndAnswers[0][i] = Calc.getQuestion();
                    questionAndAnswers[1][i] = Calc.getCorrectAnswer(questionAndAnswers[0][i]);
                    break;
                case "GCD":
                    questionAndAnswers[0][i] = GCD.getQuestion();
                    questionAndAnswers[1][i] = GCD.getCorrectAnswer(questionAndAnswers[0][i]);
                    break;
                case "Progression":
                    questionAndAnswers[0][i] = Progression.getQuestion();
                    questionAndAnswers[1][i] = Progression.getCorrectAnswer(questionAndAnswers[0][i]);
                    break;
                case "Prime":
                    questionAndAnswers[0][i] = Prime.getQuestion();
                    questionAndAnswers[1][i] = Prime.getCorrectAnswer(questionAndAnswers[0][i]);
                    break;
                default:
                    break;
            }
        }

        return questionAndAnswers;
    }

}
