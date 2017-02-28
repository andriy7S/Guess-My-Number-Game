package com.andriyshapoval;

/*
Exercise 5-7.
        Now that we have conditional statements, we can get back to the “Guess My Number”
        game from Exercise 3-4.
        You should already have a program that chooses a random number, prompts the user
        to guess it, and displays the difference between the guess and the chosen number.
        Adding a small amount of code at a time, and testing as you go, modify the program
        so it tells the user whether the guess is too high or too low, and then prompts the user
        for another guess.
        The program should continue until the user gets it right. Hint: Use two methods, and
        make one of them recursive.
*/

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int guess () {
        int guessNumber;
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of an whole number between 1 and 100 (including both). Can you guess what it is?");
        return (guessNumber = in.nextInt());
    }

    public static void compareTwoNubers(int guessNumber, int number){
        if(guessNumber == number){
            System.out.println("I have got it absolutely right, my thought number was : " + number);

        } else if (guessNumber > number ){
            System.out.println("The number you guessed is to big, please try again");
            compareTwoNubers(guess(), number);
        } else {
            System.out.println("The number you guessed is to small, please try again");
            compareTwoNubers(guess(), number);
        }
    }

    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100) + 1;

        compareTwoNubers(guess(), number);

    }
}
