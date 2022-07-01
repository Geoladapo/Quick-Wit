package codes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex_29 {
    public static void main(String[] args) {
        /*
         (Check SSN) Write a program that prompts the user to enter a Social Security
number in the format DDD-DD-DDDD, where D is a digit. Your program should
check whether the input is valid.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a SSN in this format (DDD-DD-DDDD): ");
        String userInput = in.next().trim();

        String socSec = "(\\d\\d\\d)-(\\d\\d)-(\\d\\d\\d\\d)";
        Pattern ssNum = Pattern.compile(socSec);
        Matcher matcher = ssNum.matcher(userInput);

        if(matcher.matches()){
            System.out.println(userInput + " is a valid social security number");
        }else {
            System.out.println(userInput + " is an invalid social security number");
        }

    }
}
