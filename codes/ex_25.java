package codes;

import java.util.Locale;
import java.util.Scanner;

public class ex_25 {
    public static void main(String[] args) {
        /*
         (Days of a month) Write a program that prompts the user to enter a year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next("[A-Z][a-z][a-z]");

        String days = "";

        switch (month){
            case "Sep":
            case "Apr":
            case "Jun":
            case "Nov":
                days += "30";
                break;
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days += "31";
                break;
            case "Feb":
                if (year % 4 == 0){
                    if (year % 100 == 0){
                        if (year % 400 == 0){
                            days += "29";
                        } else {
                            days += "28";
                        }
                    }else {
                        days += "29";
                    }
                } else {
                    days += "28";
                }
        }
        System.out.println(month +" "+ year +" has "+ days +" days");

    }
}
