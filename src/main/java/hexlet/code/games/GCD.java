package hexlet.code.games;

public class GCD {

    public static String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String getQuestion() {
        final int maxNumberInGame = 100;
        int number1 = (int) (Math.random() * maxNumberInGame) + 1;
        int number2 = (int) (Math.random() * maxNumberInGame) + 1;
        return number1 + " " + number2;
    }

    public static String getCorrectAnswer(String question) {
        String[] numbers = question.split(" ");
        int biggerNum = Integer.parseInt(numbers[0]);
        int smallerNum = Integer.parseInt(numbers[1]);

        while (biggerNum != 1) {
            if (biggerNum < smallerNum) {
                biggerNum += smallerNum;
                smallerNum = biggerNum - smallerNum;
                biggerNum = biggerNum - smallerNum;
            }

            if (biggerNum % smallerNum == 0) {
                return Integer.toString(smallerNum);
            } else {
                biggerNum = biggerNum % smallerNum;
            }
        }

        return Integer.toString(biggerNum);
    }
}
