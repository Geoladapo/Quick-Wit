import java.util.Scanner;

public class ex_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = in.next().trim();
        letter = letter.toLowerCase();

        int num = 0;

        if("abc".contains(letter)){
            num = 2;
        }else if ("def".contains(letter)){
            num = 3;
        }else if("ghi".contains(letter)){
            num = 4;
        } else if ("jkl".contains(letter)) {
            num = 5;
        } else if ("mno".contains(letter)) {
            num = 6;
        } else if ("pqrs".contains(letter)) {
            num = 7;
        } else if ("tuv".contains(letter)) {
            num = 8;
        } else if ("wxyz".contains(letter)) {
            num = 9;
        }else {
            System.out.println("Invalid character entered");
            System.exit(0);
        }

        System.out.println("The corresponding key is "+ num);
    }
}
