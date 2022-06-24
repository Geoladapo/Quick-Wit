import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        /*
        Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:
         */

        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = in.nextInt();

        Boolean fiveAndSix = number % 5 == 0 && number % 6 == 0;
        Boolean fiveOrSix = number % 5 == 0 || number % 6 == 0;
        boolean fiveSixNotBoth = (number % 5 == 0 || number % 6 == 0) ^ (number % 5 == 0 && number % 6 == 0);

        System.out.println("Is "+ number + " divisible by 5 and 6? "+ fiveAndSix);
        System.out.println("Is "+ number + " divisible by 5 or 6? "+ fiveOrSix);
        System.out.println("Is "+ number + " divisible by 5 or 6, but not both? "+ fiveSixNotBoth);

    }
}
