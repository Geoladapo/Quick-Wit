import java.util.Locale;
import java.util.Scanner;

public class ex_22 {
    public static void main(String[] args) {
/*
 (Convert letter grade to number) Write a program that prompts the user to enter a
letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
1, or 0.
*/
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String grade = input.next();
        char letterGrade = grade.charAt(0);

       char numberGrade = '0';
       if (letterGrade == 'A'){
           numberGrade = '4';
       }else if (letterGrade == 'B'){
           numberGrade = '3';
       }else if(letterGrade == 'C'){
           numberGrade = '2';
       }else if (letterGrade == 'D'){
           numberGrade = '1';
       }else if (letterGrade == 'F'){
           numberGrade = '0';
       } else
           System.out.println("Invalid grade entry");


       if (numberGrade >= '0' && numberGrade <= '4'){
           System.out.println("The numeric value for grade "+ letterGrade + " is "+ numberGrade);
       }
    }
}
