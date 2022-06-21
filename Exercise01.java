import java.awt.*;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
         (Game: heads or tails) Write a program that lets the user guess whether the flip of
         a coin results in heads or tails. The program randomly generates an integer 0 or 1,
         which represents head or tail. The program prompts the user to enter a guess and
         reports whether the guess is correct or incorrect.
         */
        int Head = 0, Tail = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("\t\t|---------------|\n\t\tHead or Tail Game\n\t\t|---------------|");
        System.out.println();
        System.out.print("Enter the guess, 0 for Tail and 1 for Head: ");
        int playerGuess = in.nextInt();

        if (playerGuess == 1 || playerGuess == 0)
        {
            int  computerGuess = (int)(Math.random() * 2);

            if(computerGuess == playerGuess)
                System.out.println("Awesome Man! Your are correct.. The computer guess is also "+ computerGuess);
            else
                System.out.println("OH man! Your Guess is incorrect, The computer Guess is "+ computerGuess + "\nTry Again");
        }
        else{
            System.out.println("Oops! Any number aside 0 and 1 is not allowed,\nplease enter correct guess between 1 or 0.");
        }
    }
}
