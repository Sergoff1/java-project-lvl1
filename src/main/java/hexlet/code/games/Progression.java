package hexlet.code.games;

public class Progression {

    public static String getDescription() {
        return "What number is missing in the progression?";
    }

    public static String getQuestion() {
        final int maxStartNumber = 50;
        final int maxDifference = 20;
        final int maxLength = 14;
        final int minLength = 5;

        int startNumber = (int) (Math.random() * maxStartNumber);
        int difference = (int) (Math.random() * maxDifference);
        int length = minLength + (int) (Math.random() * (maxLength - minLength));

        String[] question = new String[length];

        question[0] = Integer.toString(startNumber);

        int currentNumber = startNumber;
        for (int i = 1; i < length; i++) {
            currentNumber += difference;
            question[i] = Integer.toString(currentNumber);
        }

        int indexOfHiddenElement = (int) (Math.random() * (length + 1));

        question[indexOfHiddenElement] = "..";

        return new String().join(" ", question);
    }

    public static String getCorrectAnswer(String question) {
        String[] progression = question.split(" ");
        int indexOfHiddenElement = 0;

        for (int i = 0; i < progression.length; i++) {
            if (progression[i].equals("..")) {
                indexOfHiddenElement = i;
                break;
            }
        }

        int difference = 0;
        if (indexOfHiddenElement > 1) {
            difference = Integer.parseInt(progression[1]) - Integer.parseInt(progression[0]);
        } else {
            difference = Integer.parseInt(progression[progression.length - 1])
                    - Integer.parseInt(progression[progression.length - 2]);
        }

        if (indexOfHiddenElement != 0) {
            return "" + (Integer.parseInt(progression[indexOfHiddenElement - 1]) + difference);
        } else {
            return "" + (Integer.parseInt(progression[indexOfHiddenElement + 1]) - difference);
        }
    }
}
