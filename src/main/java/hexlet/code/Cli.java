package hexlet.code;

import java.util.Scanner;

class Cli {
    static void greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
    }
}
