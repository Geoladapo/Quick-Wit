import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /*
        Compute the perimeter of a triangle.. Write a program that reads three edges for
        a triangle and computes the perimeter if the input is valid. Otherwise, display that
        the input is invalid. The input is valid if the sum of every pair of two edges is
         greater than the remaining edge.
         */
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value for three edges of a triangle: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();


        if(a > (b + c) || b > (a + c) || c > (b + a))
            System.out.println("Invalid input");
        else
            System.out.println("Perimeter is "+(a+b+c));

    }
}
