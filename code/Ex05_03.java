package code;

import java.util.Scanner;

public class Ex05_03 {
    public static void main(String[] args) {

        final double POUNDS = 2.2;

        System.out.println("Kilograms       Pounds");
        for (int i = 1; i < 199; i += 2){
            System.out.printf("%-15d %6.1f\n", i, (i * POUNDS));
        }
    }
}
