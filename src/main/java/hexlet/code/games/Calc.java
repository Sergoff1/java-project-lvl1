package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final String NAME = "Calc";
    static final String DESCRIPTION = "What is the result of the expression?";

    public static String[] getQuestionAndAnswer() {
        final int maxNumber = 51;
        char[] operations = {'+', '-', '*'};

        int num1 = Utils.getRandomNumberUpTo(maxNumber);
        int num2 = Utils.getRandomNumberUpTo(maxNumber);
        char operation = operations[Utils.getRandomNumberUpTo(operations.length)];

        String[] questionAndAnswer = new String[2];

        String answer = switch (operation) {
            case '-' -> Integer.toString(num1 - num2);
            case '+' -> Integer.toString(num1 + num2);
            case '*' -> Integer.toString(num1 * num2);
            default -> "0";
        };

        questionAndAnswer[0] = num1 + " " + operation + " " + num2;
        questionAndAnswer[1] = answer;

        return questionAndAnswer;
    }

    public static void start() {
        String[][] questionAndAnswers = new String[Engine.ROUNDS_NUMBER][0];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            questionAndAnswers[i] = Calc.getQuestionAndAnswer();
        }
        Engine.start(questionAndAnswers, DESCRIPTION);
    }
}
