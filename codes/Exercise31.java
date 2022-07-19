package codes;

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Employee's name(e.g., smith: ");
        String name = in.nextLine();

        System.out.print("Number of hours worked in a week(e.g., 10): ");
        double hours = in.nextDouble();

        System.out.print("Hourly pay rate: ");
        double payrate = in.nextDouble();

        System.out.print("Federal tax withholding rate(e.g., 20%): ");
        double fedTaxrate = in.nextDouble();

        System.out.print("State tax withholding rate(e.g., 9%): ");
        double staTaxRate = in.nextDouble();


        double grosspay = hours * payrate;
        double federalTax = grosspay * fedTaxrate;
        double stateTax = grosspay * staTaxRate;
        double totalTax = fedTaxrate + staTaxRate;
        double netPay = grosspay - totalTax;

        System.out.print("\nEmployee's name: "+ name);
        System.out.print("\nHours worked: "+ hours);
        System.out.print("\nPay rate: $"+ payrate);
        System.out.printf("\nGross Pay: $%.2f", grosspay);
        System.out.print("\nDeductions: ");

        System.out.printf("\n\tFederal Withholding: $%.2f", federalTax);
        System.out.printf("\n\tState Withholding: $%.2f", stateTax);
        System.out.printf("\n\ttotal Deduction: $%.2f", totalTax);
        System.out.printf("\n\nNet Pay: $%.3f", netPay);
        in.close();

    }
}
