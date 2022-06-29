import java.util.Scanner;

public class EX18 {
    public static void main(String[] args) {

//        Find the Unicode of a character Write a program that receives a character and
//        displays its Unicode.

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character: ");

        String userInput = in.next("[A-Za-z\\d]");

        char output = userInput.charAt(0);

        System.out.println("The unicode for the character "+ userInput + " is "+ (int)output);

    }
}
