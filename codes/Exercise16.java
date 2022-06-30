import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numberOfSides = input.nextInt();

        System.out.println("Enter the side: ");
        double s = input.nextDouble();

        Double area = ((numberOfSides * Math.pow(s,2)) / (4 * (Math.tan(Math.PI / numberOfSides))));

        System.out.printf("The Area of the polygon is %f", area);

    }
}
