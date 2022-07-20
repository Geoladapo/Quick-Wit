package code;

import java.util.Random;
import java.util.Scanner;

public class Ex05_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         int correctAnswers = 0, wrongAnswers = 0;
         long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++){

            int n1 = (int) (Math.random() * 15);
            int n2 = (int) (Math.random() * 15);

            System.out.print("What is "+ n1 +" + "+ n2+ "? " );
            int answer = input.nextInt();

            if((n1 + n2) == answer){
                System.out.println("correct!\n");
                correctAnswers++;

            } else {
                System.out.println("Wrong!\n(Answer)" +n1 +" + "+ n2 +" = " + (n1 + n2));
                System.out.println();
                wrongAnswers++;
            }
        }

        long endTime = System.currentTimeMillis();
        long totalTimeMillis = endTime - startTime;

        System.out.println("You answered "+ correctAnswers +" questions correctly");
        System.out.println("You answered "+ wrongAnswers +" questions wrongly");
        System.out.println("Total runtime was: "+ (totalTimeMillis / 1000) + " seconds.");
    }
}
