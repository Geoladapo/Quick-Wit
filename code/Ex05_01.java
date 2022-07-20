package code;

import java.util.Scanner;

public class Ex05_01 {
    public static void main(String[] args) {

            int negInt = 0, posInt = 0, count= 0, sum = 0;

            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer, the input ends if it is 0: ");
            int numbers = input.nextInt();

            if (numbers == 0){
                System.out.println("no numbers are entered except 0");
            }else {
                while(numbers != 0) {
                    sum += numbers;
                    count++;

                    if (numbers < 0) {
                        negInt++;
                    } else {
                        posInt++;
                    }

                    numbers = input.nextInt();
                }

                double avg =  sum / count;

                System.out.println("The number of positives is "+ posInt);
                System.out.println("The number of negatives is "+ negInt);
                System.out.println("The total is "+ sum);
                System.out.println("The average is "+ avg);
            }

        }
}
