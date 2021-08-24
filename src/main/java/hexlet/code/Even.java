package hexlet.code;

import java.util.Scanner;

class Even {
    public static void startGame() {
        String playerName = Cli.greet();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        Scanner sc = new Scanner(System.in);
        for (byte i = 0; i < 3; i++) {
            int number = (int)(Math.random() * 100);
            System.out.println("Question: " + number);

            System.out.print("Your answer: ");
            String answer = sc.next();

            if (getCorrectAnswer(number).equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + getCorrectAnswer(number) + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }

    static String getCorrectAnswer(int number) {
        if (number % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
