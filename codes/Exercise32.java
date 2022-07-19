package codes;

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        /*
         (Order three cities) Write a program that prompts the user to enter three cities and
displays them in ascending order.

 /*
        c -> l -> a
        if firstcity > secondcity
        temp = l
        sec = c
        fir = a

        if sec > third
        temp = a
        third = c
        sec = l

         */

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firCity = in.nextLine();

        System.out.print("Enter the second city: ");
        String secCity = in.nextLine();

        System.out.print("Enter the third city: ");
        String thirdCity = in.nextLine();

        String tempCity = " ";

        if (firCity.charAt(0) > secCity.charAt(0)) {
            tempCity = secCity;
            secCity = firCity;
            firCity = thirdCity;

            if (secCity.charAt(0) > thirdCity.charAt(0)) {
                tempCity = thirdCity;
                thirdCity = secCity;
                secCity = tempCity;
            }



        }

        System.out.println("The cities in alphabetical order are: "+ firCity +" "+ secCity +" "+ thirdCity +".");

    }
}
