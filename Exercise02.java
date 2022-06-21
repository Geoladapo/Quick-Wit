import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
/*
   Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit numbers. The program prompts the user to enter a three-digit numbers and
   determines whether the user wins according to the following rules:
   1. If the user input matches the lottery numbers in the exact order, the award is
   $10,000.
   2. If all digits in the user input match all digits in the lottery numbers, the award is
   $3,000.
   3. If one digit in the user input matches a digit in the lottery numbers, the award is
   $1,000.
 */

        Scanner in = new Scanner(System.in);
        int lotteryNumber = (int)((Math.random() * 900) + 100);

        System.out.print("Enter only 3-digits: ");
        int playerNumber = in.nextInt();


        //checking for permutations
        int l1 = lotteryNumber / 100;
        int l2 = lotteryNumber % 100;
        int l3 = (l2 / 10);
        l2 %= 10;

        int g1 = playerNumber / 100;
        int g2 = playerNumber % 100;
        int g3 = (g2 / 10);
        g2 %= 10;

        if (playerNumber >= 100 && playerNumber < 1000){
        if (lotteryNumber == playerNumber){
            System.out.println("Congrats! You just won $10,000.");
        } else if ((l1 == g1 || l1 == g2 || l1 == g3) && (l2 == g1 || l2 == g2 || l2 == g3)
                && (l3 == g1 || l3 == g2 || l3 == g3)) {
            System.out.println("The numbers only Matches\nSo you won $3,000");
            } else if ((l2 == g1 || l2 == g2 || l2 == g3) && (l1 == g1 || l1 == g2 || l1 == g3)
                    && (l3 == g1 || l3 == g2 || l3 == g3)) {
            System.out.println("The numbers only Matches\nSo you won $3,000");
            } else if ((l3 == g1 || l3 == g2 || l3 == g3) && (l2 == g1 || l2 == g2 || l2 == g3)
                    && (l1 == g1 || l1 == g2 || l1 == g3)){
            System.out.println("The numbers only Matches\nSo you won $3,000");
            } else if ((l2 == g1 || l2 == g2 || l2 == g3) && (l3 == g1 || l3 == g2 || l3 == g3)
                    && (l1 == g1 || l1 == g2 || l1 == g3)){
            System.out.println("The numbers only Matches\nSo you won $3,000");
            } else if ((l1 == g1 || l1 == g2 || l1 == g3) &&(l3 == g1 || l3 == g2 || l3 == g3)
                    && (l2 == g1 || l2 == g2 || l2 == g3)){
              System.out.println("The numbers only Matches\nSo you won $3,000");
            } else if ((l3 == g1 || l3 == g2 || l3 == g3) && (l1 == g1 || l1 == g2 || l1 == g3) && (l2 == g1 || l2 == g2 || l2 == g3)){
            System.out.println("The numbers only Matches\nSo you won $3,000");
        } else if (l1 == g1 || l1 == g2 || l1 == g3 || l2 == g1 || l2 == g2 || l2 == g3 || l3 == g1 || l3 == g2 || l3 == g3) {
              System.out.println("Only one or two numbers Matches\nSo you won $1,000");
        }}
        else
            System.out.println("No Man! sorry..You can only allowed to enter 3-digits");

        }

    }

