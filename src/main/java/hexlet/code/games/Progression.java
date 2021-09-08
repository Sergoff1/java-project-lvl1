package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {

    public static final String NAME = "Progression";

    public static String getDescription() {
        return "What number is missing in the progression?";
    }

    public static String[] getQuestionAndAnswer() {
        final int maxStartNumber = 50;
        final int maxDifference = 20;
        final int maxLength = 14;
        final int minLength = 5;

        int startNumber = Utils.getRandomNumberUpTo(maxStartNumber);
        int difference = Utils.getRandomNumberUpTo(maxDifference);
        int length = minLength + Utils.getRandomNumberUpTo((maxLength - minLength));

        String[] question = new String[length];

        question[0] = Integer.toString(startNumber);

        int currentNumber = startNumber;
        for (int i = 1; i < length; i++) {
            currentNumber += difference;
            question[i] = Integer.toString(currentNumber);
        }

        int indexOfHiddenElement = Utils.getRandomNumberUpTo(length);

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[1] = question[indexOfHiddenElement];
        question[indexOfHiddenElement] = "..";
        questionAndAnswer[0] = new String().join(" ", question);

        return questionAndAnswer;
    }
}
