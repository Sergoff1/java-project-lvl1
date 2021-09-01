package hexlet.code.games;

public class Even {

    public static final String NAME = "Even";

    public static String getDescription() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static String[] getQuestionAndAnswer() {
        final int maxNumberInGame = 100;
        int number = (int) (Math.random() * maxNumberInGame);

        String[] questionAndAnswer = new String[2];

        questionAndAnswer[0] = Integer.toString(number);
        questionAndAnswer[1] = number % 2 == 0 ? "yes" : "no";

        return questionAndAnswer;
    }
}
