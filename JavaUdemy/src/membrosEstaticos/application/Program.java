package membrosEstaticos.application;

import java.util.Locale;
import java.util.Scanner;

import membrosEstaticos.util.Calculator;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("Pi value: %.2f\n", Calculator.PI);

        scanner.close();
    }


}
