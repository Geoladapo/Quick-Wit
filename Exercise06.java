import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {

/*
       Science: day of the week using zeller's christian formula
        h = (q + (26*(m + 1)/10) + k + (k/4) + (j/4) + (5*j)) % 7;
        h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
        Wednesday, 5: Thursday, 6: Friday).
       ■ q is the day of the month.
       ■ m is the month (3: March, 4: April, …, 12: December). January and February
        are counted as months 13 and 14 of the previous year.
       ■ j is the century (i.e., year
        100 ).
       ■ k is the year of the century (i.e., year % 100)
 */


        Scanner in = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012): ");
        int year = in.nextInt();

        System.out.print("Enter Month: 1 - 12: ");
        int moon = in.nextInt();

        int m;
        if(moon == 1){
            m = 13;
            year -= 1;
        } else if(moon == 2){
            m = 14;
            year -= 1;
        } else {
            m = moon;
        }

        int k = year % 100;
        int j = year / 100;

        System.out.print("Enter day of the Month: 1-31: ");
        int q = in.nextInt();

        int h = ( q + ( 26 * ( m + 1 ) / 10 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j )) % 7;

        String dayOfTheWeek = "";

        switch (h) {
            case 0:
                dayOfTheWeek += "Saturday";
                break;
            case 1:
                dayOfTheWeek += "Sunday";
                break;
            case 2:
                dayOfTheWeek += "Monday";
                break;
            case 3:
                dayOfTheWeek += "Tuesday";
                break;
            case 4:
                dayOfTheWeek += "Wednesday";
                break;
            case 5:
                dayOfTheWeek += "Thursday";
                break;
            case 6:
                dayOfTheWeek += "Friday";
                break;
        }
        System.out.println("Day of the week is "+dayOfTheWeek);
    }
}
