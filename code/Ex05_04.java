package code;

public class Ex05_04 {
    public static void main(String[] args) {
        final double KILOMETERS = 1.609;

        System.out.println("Miles        Kilometers");

        for (int i = 1; i <= 10; i++){
            System.out.printf("%-15d %6.3f\n", i, (i * KILOMETERS));
        }
    }
}
