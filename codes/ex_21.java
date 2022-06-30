import java.util.Locale;
import java.util.Scanner;

public class ex_21 {
    /*
     (Vowel or consonant?) Write a program that prompts the user to enter a letter and
check whether the letter is a vowel or consonant.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String str = in.next().trim();

        if (str.length() > 1){
            System.out.println(str + " is invalid input.");
        }else {
            char ch = str.charAt(0);
            if(Character.isLetter(ch)) {
                String s = ch + "";
                String res = "";
                if ("aeiou".contains(s.toLowerCase(Locale.ROOT))) {
                    res += "vowel";
                } else {
                    res += "consonant";
                }
                System.out.println(ch + " is a "+ res);
            }else {
                System.out.println(ch + "is invalid input.");
            }
        }
    }
}
