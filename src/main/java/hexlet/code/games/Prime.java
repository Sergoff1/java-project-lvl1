package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final String NAME = "Prime";
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[] getQuestionAndAnswer() {
        final int maxNumberInGame = 504;
        int number = Utils.getRandomNumberUpTo(maxNumberInGame);

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = Integer.toString(number);
        questionAndAnswer[1] = isPrime(number) ? "yes" : "no";

        return questionAndAnswer;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void start() {
        String[][] questionAndAnswers = new String[Engine.ROUNDS_NUMBER][0];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            questionAndAnswers[i] = Prime.getQuestionAndAnswer();
        }
        Engine.start(questionAndAnswers, DESCRIPTION);
    }
}
