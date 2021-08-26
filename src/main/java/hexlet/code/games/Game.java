package hexlet.code.games;

public abstract class Game {

    public abstract String getDescription();

    public abstract String getQuestion();

    public abstract String getCorrectAnswer(String question);
}
