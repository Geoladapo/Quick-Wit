package codes;

import java.util.Scanner;

public class ex_30 {
    public static void main(String[] args) {
        /*
         (Check substring) Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.

Example:
Enter string s1: ABCD
Enter string s2: BC
BC is a substring of ABCD
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String s1: ");
        String s1 = in.next();


        System.out.print("Enter String s2: ");
        String s2 = in.next();

        int longestLength = Math.max(s1.length(), s2.length());
        final String IS_A = " is a ";
        final String IS_NOT = " is not a ";
        String big, small;

        if (longestLength == s1.length()){
            big = s1;
            small = s2;
        }else{
            big = s2;
            small = s1;
        }
        String result = "";
        if (big.contains(small)){
            result += IS_A;
        }else {
            result += IS_NOT;
        }
        System.out.println(small + result + "substring of " + big);
        in.close();
    }
}
