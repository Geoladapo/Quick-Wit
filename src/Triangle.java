import java.util.Scanner;

public class Triangle {
    double a, b, c;
    double area, perimeter;

    void inputSides(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input Side A: ");
        a = input.nextDouble();
        System.out.println("Input Side B: ");
        b = input.nextDouble();
        System.out.println("Input Side C: ");
        c = input.nextDouble();
    }

    void computeArea(){
        double s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    void computePerimeter(){
        perimeter = (double) a + b + c;
    }

    void displayOutput(){
        System.out.printf("SideA: %.2f\nSideB: %.2f\nSideC: %.2f"
        + "\nArea: %.2f\nPerimeter: %.2f",
                a, b, c, area, perimeter);
    }

    public static void main(String[] args) {
        Triangle myTriangle = new Triangle();
        myTriangle.inputSides();
        myTriangle.computeArea();
        myTriangle.computePerimeter();
        myTriangle.displayOutput();
    }
}
