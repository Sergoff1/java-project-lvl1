package hexlet.code.games;

import java.util.Scanner;

public class Even extends Game {

    @Override
    public final String getDescription() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    @Override
    public final String getQuestion() {
        Scanner sc = new Scanner(System.in);
        final int maxNumberInGame = 100;
        int number = (int) (Math.random() * maxNumberInGame);
        return Integer.toString(number);
    }

    @Override
    public final String getCorrectAnswer(String question) {
        if (Integer.parseInt(question) % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
