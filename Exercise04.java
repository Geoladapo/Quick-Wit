import java.util.Scanner;
import java.util.WeakHashMap;

public class Exercise04 {
    public static void main(String[] args) {
/*
        ost of shipping) A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in
pounds).
c(w) = d
3.5, if 0 6 w 6 = 1
5.5, if 1 6 w 6 = 3
8.5, if 3 6 w 6 = 10
10.5, if 10 6 w 6 = 20
Write a program that prompts the user to enter the weight of the package and
display the shipping cost. If the weight is greater than 50, display a message “the
package cannot be shipped.”
*/

        double weight = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight of the package: ");
        weight = in.nextDouble();

        String Shipping = "";

          if (weight >= 50) {
              System.out.println("The package cannot be shipped");
              in.close();
              return;
          }
            else if (weight > 0 && weight <= 1) {
            Shipping += 3.5;

        } else if (weight > 1 && weight <= 3){
            Shipping += 5.5;

        } else if (weight > 3 && weight <= 10) {
            Shipping += 8.5;

        }else if (weight > 10 && weight <= 20) {
            Shipping += 10.5;

        }
        System.out.println("With a package weight of \"" + weight + "\" your cost of shipping will be \"" + Shipping + "\"");
            in.close();
    }
}
