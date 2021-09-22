package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final String NAME = "Even";
    static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";

    public static String[] getQuestionAndAnswer() {
        final int maxNumberInGame = 100;
        int number = Utils.getRandomNumberUpTo(maxNumberInGame);

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = Integer.toString(number);
        questionAndAnswer[1] = number % 2 == 0 ? "yes" : "no";

        return questionAndAnswer;
    }

    public static void start() {
        String[][] questionAndAnswers = new String[Engine.ROUNDS_NUMBER][0];
        for (int i = 0; i < Engine.ROUNDS_NUMBER; i++) {
            questionAndAnswers[i] = Even.getQuestionAndAnswer();
        }
        Engine.start(questionAndAnswers, DESCRIPTION);
    }
}
