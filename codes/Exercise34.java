package codes;

import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {

/*
 (Count positive and negative numbers and compute the average of numbers) Write
a program that reads an unspecified number of integers, determines how many
positive and negative values have been read, and computes the total and average of
the input values (not counting zeros). Your program ends with the input 0. Display
the average as a floating-point number. Here is a sample run:


enter numbers and store in a var
while(numbers != 0)
add numbers to each other
count numbers
check for -Ve and +ve numbers. and store in different var
calculate the average
print all results.
 */
        int negInt = 0, posInt = 0, count= 0, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int numbers = input.nextInt();

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
