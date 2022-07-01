package codes;

import java.util.Scanner;

public class ex_26 {
    public static void main(String[] args) {
        /*
         (Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following characters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology
         */
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two Character Ex. (C3), M, C, or I for your major\nand 1 - 4, for your status. "+
                "(1 being freshman and 4 being senior): ");
        String statusCode = in.nextLine();

        char major = statusCode.charAt(0);
        char statusYear = statusCode.charAt(1);

        String s1 = "";
        String s2 = "";

        if(major == 'M'){
            s1 = "Mathematics";
        } else if (major == 'C') {
            s1 = "Computer science";
        } else if (major == 'I') {
            s1 = "Information technology";}

         if (statusYear == '1') {
             s2 = "freshman";
         } else if (statusYear == '2') {
             s2 = "sophomore";
         } else if (statusYear == '3') {
             s2 = "junior";
         } else if (statusYear == '4') {
             s2 = "senior";
         }

        System.out.print(s1 +" "+ s2);

    }
}
