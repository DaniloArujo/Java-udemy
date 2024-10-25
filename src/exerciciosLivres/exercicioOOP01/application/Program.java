package exerciciosLivres.exercicioOOP01.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.exercicioOOP01.entities.Rectangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle widht: ");
        rectangle.width = scanner.nextDouble();
        
        System.out.print("Enter rectangle widht: ");
        rectangle.height = scanner.nextDouble();

        System.out.print(rectangle);

        scanner.close();
    }
}