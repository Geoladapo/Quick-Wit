package codes;

import java.util.Scanner;
/*
cess a string) Write a program that prompts the user to enter a string and displays its length and its first character.
 */
public class Exercise28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a massage: ");
        String str = in.nextLine();
        int strLen = str.length();
        char firstChar = str.charAt(0);

        System.out.println("The lenght of the string is "+ strLen +" while the First character is "+ firstChar);
    }
}
