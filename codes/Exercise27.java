package codes;

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        /*
         (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
which is calculated from the other nine digits using the following formula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
If the checksum is 10, the last digit is denoted as X according to the ISBN-10
convention. Write a program that prompts the user to enter the first 9 digits and
displays the 10-digit ISBN (including leading zeros). Your program should read
the input as an integer. Here are sample runs:
         */
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn = input.nextLine();

        for (int i = 0, j = 1; i < 9; i++, j++ ) {
            int num = Integer.parseInt(String.valueOf(isbn.charAt(i)));
            sum += num * j;
        }
         int d10 = sum % 11;
        if (d10 == 10) {
            isbn += 'X';
        }else {
            isbn += d10;
        }
        System.out.println("ISBN-10: "+ isbn);
    }
}
