import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x1 = in.nextInt();
        double y1 = in.nextInt();

        double x2 = 0;
        double y2 = 0;

        double d = ((x2 - x1)*(x2 - x1)) +  ((y2 - y1)*(y2 - y1));
        double dist = Math.pow(d, 0.5);

        if (dist <= 10) {
            System.out.println("Point ("+ x1 + ", "+ y1 + " ) is in the circle");
        }else
            System.out.println("Point ("+ x1 + ", "+ y1 + " ) is not in the circle");

    }
}
