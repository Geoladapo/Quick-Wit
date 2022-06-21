import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\t\t|------------|\n\t\tCoin flip Game\n\t\t|------------|");
        System.out.println();
        int computerGuess = (int) (Math.random() * 2);

        System.out.print("Enter your Guess; 0 for Tail and 1 for Head: ");
        int userGuess = in.nextByte();

        if (userGuess < 2) {
            if (computerGuess == userGuess) {
                System.out.println("Awesome man.. You are correct\nThe computer guess is also " + computerGuess);
            } else
                System.out.println("SORRY man.. Your guess is incorrect\nThe computer guess is " + computerGuess);
        }
        else
            System.out.println("Hey man..Enter number between 0 and 1");
    }
}
