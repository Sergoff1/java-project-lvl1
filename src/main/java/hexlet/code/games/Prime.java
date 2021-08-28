package hexlet.code.games;

public class Prime {

    public static String getDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String getQuestion() {
        final int maxNumberInGame = 504;
        int number = (int) (Math.random() * maxNumberInGame);
        return Integer.toString(number);
    }

    public static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
