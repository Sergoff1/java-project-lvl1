package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static final String NAME = "GCD";
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static String[] getQuestionAndAnswer() {
        final int maxNumberInGame = 100;
        int number1 = Utils.getRandomNumberUpTo(maxNumberInGame) + 1;
        int number2 = Utils.getRandomNumberUpTo(maxNumberInGame) + 1;

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = number1 + " " + number2;

        while (number1 != 0 && number2 != 0) {
            if (number1 > number2) {
                number1 %= number2;
            } else {
                number2 %= number1;
            }
        }

        questionAndAnswer[1] = Integer.toString(number1 + number2);

        return questionAndAnswer;
    }

    public static void start() {
        String[][] questionAndAnswers = new String[Engine.ROUNDS_NUMBER][0];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            questionAndAnswers[i] = GCD.getQuestionAndAnswer();
        }
        Engine.start(questionAndAnswers, DESCRIPTION);
    }
}
