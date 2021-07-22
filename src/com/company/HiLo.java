package com.company;

import java.util.Scanner;

public class HiLo {

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
// Генерация случайного числа
        int theNumber = (int) (Math.random() * 100 + 1);
//        System.out.println(theNumber);
        int guess;
        int count = 0;
        do {
            System.out.println("Guess the Number (1...100):");
            guess = scan.nextInt();
            System.out.println("You guess " + guess);
            if (guess > theNumber)
                System.out.println("try smaller");
            else if (guess < theNumber)
                System.out.println("try bigger");
            else
                System.out.println("Congratulations! You win!!! :)");
            count++;
        } while (guess != theNumber);
        System.out.println("You have used " + count + " number of trying!");

    }


}
