package hexlet.code.games;

public class Even {

    public static String getDescription() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static String getQuestion() {
        final int maxNumberInGame = 100;
        int number = (int) (Math.random() * maxNumberInGame);
        return Integer.toString(number);
    }

    public static String getCorrectAnswer(String question) {
        if (Integer.parseInt(question) % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
