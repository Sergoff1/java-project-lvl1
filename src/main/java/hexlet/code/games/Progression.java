package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {

    public static final String NAME = "Progression";

    public static String getDescription() {
        return "What number is missing in the progression?";
    }

    public static String[] getQuestionAndAnswer() {
        final int maxStartNumber = 50;
        final int maxStep = 20;
        final int maxLength = 14;
        final int minLength = 5;

        int startNumber = Utils.getRandomNumberUpTo(maxStartNumber);
        int step = Utils.getRandomNumberUpTo(maxStep);
        int length = minLength + Utils.getRandomNumberUpTo((maxLength - minLength));

        String[] question = new String[length];

        for (int i = 0; i < length; i++) {
            int currentNumber = startNumber + step * i;
            question[i] = Integer.toString(currentNumber);
        }

        int indexOfHiddenElement = Utils.getRandomNumberUpTo(length);

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[1] = question[indexOfHiddenElement];
        question[indexOfHiddenElement] = "..";
        questionAndAnswer[0] = "".join(" ", question);

        return questionAndAnswer;
    }
}
