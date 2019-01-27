package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        int n, guess;
        
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        n = rand.nextInt(20);
        System.out.print("I'm thinking of a number between 0-20.  What is the number? ");
        guess = input.nextInt();

        if (guess == n) {
            System.out.println("You got it!");
        } else {
            System.out.println("Nope.  The number is " + n);
        }
    }
    
}
