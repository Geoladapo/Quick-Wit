import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
/*
Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper game.
(A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws.
 */
        System.out.println("\t\t\tS R T GAME\nFollow the Rules to have a nice Game Play\nYou can only win the computer if you enter\nthe strong weapon :) LOL\n");
        System.out.println("A scissor can cut a paper, a rock can knock a scissor, and a paper can "+
                "wrap a rock.\nThe program randomly generates a number 0, 1, or 2 representing "+
        "scissor, rock, and paper.\nThe program prompts the user to enter a number 0, 1, or "+
        "2\nand displays a message indicating whether the user or the computer wins, loses,"+
        "or draws.\n");

        Scanner in = new Scanner(System.in);
        final int scissor = 0;
        final int rock = 1;
        final int paper = 2;

        byte comp_play = (byte)(Math.random() * 3);

        System.out.print("Scissor(0) Rock(1) Paper(2): ");
        byte user_play = in.nextByte();

        if(user_play == 0 || user_play == 1 || user_play == 2) {
            switch (user_play){
                case 0:
                    if (comp_play == user_play)
                        System.out.println("Oh Guy! You're close\nThe computer is scissor. You are scissor too. It is a draw.");
                    else if (comp_play == rock)
                        System.out.println("HAHAHA i told you you can't win me.\nThe computer is rock. you are Scissor. You lose.\nWill you like to play Again?");
                    else if (comp_play == paper)
                        System.out.println("Men you're Brilliant and good.\nThe computer is rock. you are paper.You won.\nIf you're sure Play me Again.");
                    break;
                case 1:
                    if (comp_play == user_play)
                        System.out.println("Oh Guy! You're close\nThe computer is rock. You are rock too. It is a draw");
                    else if (comp_play == scissor)
                        System.out.println("Men you're Brilliant and good.\nThe computer is rock. you are paper.You won.\nIf you're sure Play me Again.");
                    else if (comp_play == paper)
                        System.out.println("HAHAHA i told you you can't win me.\nThe computer is rock. you are Scissor. You lose.\nWill you like to play Again?");
                    break;
                case 2:
                    if (comp_play == user_play)
                        System.out.println("Oh Guy! You're close\nThe computer is paper. You are paper too. It is a draw");
                    else if (comp_play == rock)
                        System.out.println("Men you're Brilliant and good.\nThe computer is rock. you are paper.You won.\nIf you're sure Play me Again.");
                    else if (comp_play == scissor)
                        System.out.println("HAHAHA i told you you can't win me.\nThe computer is rock. you are Scissor. You lose.\nWill you like to play Again?");
                    break;
            }
        }else
            System.out.println("The computer wins! You entered wrong input so the program forfeit.");
    }
}
