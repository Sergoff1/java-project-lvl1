package hexlet.code.games;

public class Calc {

    public static String getDescription() {
        return "What is the result of the expression?";
    }

    public static String getQuestion() {
        final int maxNumber = 51;
        char[] operations = {'+', '-', '*'};

        int num1 = (int) (Math.random() * maxNumber);
        int num2 = (int) (Math.random() * maxNumber);
        char operation = operations[(int) (Math.random() * operations.length)];

        return num1 + " " + operation + " " + num2;
    }

    public static String getCorrectAnswer(String question) {
        String[] expressionElements = question.split(" ");
        int num1 = Integer.parseInt(expressionElements[0]);
        int num2 = Integer.parseInt(expressionElements[2]);

        return switch (expressionElements[1]) {
            case "-" -> Integer.toString(num1 - num2);
            case "+" -> Integer.toString(num1 + num2);
            case "*" -> Integer.toString(num1 * num2);
            default -> "0";
        };
    }
}
