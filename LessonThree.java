package ru.geekbrains.java;

import java.util.Random;
import java.util.Scanner;
//задание 3.1
public class LessonThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int x = r.nextInt(9);
        System.out.println("Guess the number!");
        for (int i = 0; i < 3; i++) {

            int number = scanner.nextInt();
            if (x == number) {
                System.out.println("You're right. You win!!!");
                wannaPlayAgain();
            } else if (x > number)
                System.out.println("x > guessed number");
            else
                System.out.println("x < guessed number");
        }
        wannaPlayAgain();

    }
    private static void wannaPlayAgain( ) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Для повторения игры нажмите 1");
        int number2 = scanner.nextInt();
        if (number2 == 1) {
           main(null);
        }
        else {
            System.exit(0);
        }
        }
}
