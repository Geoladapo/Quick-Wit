import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter  an ASCII code: ");

        int userInput = in.nextInt();

       char output = (char) userInput;

        System.out.println("The character for ASCII code "+ userInput + " is " + output);

    }
}
