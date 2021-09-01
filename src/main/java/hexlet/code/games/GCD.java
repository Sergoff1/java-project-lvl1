package hexlet.code.games;

public class GCD {

    public static final String NAME = "GCD";

    public static String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[] getQuestionAndAnswer() {
        final int maxNumberInGame = 100;
        int number1 = (int) (Math.random() * maxNumberInGame) + 1;
        int number2 = (int) (Math.random() * maxNumberInGame) + 1;

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
}
