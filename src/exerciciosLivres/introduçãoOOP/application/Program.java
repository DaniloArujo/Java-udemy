package exerciciosLivres.introduçãoOOP.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.introduçãoOOP.entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com os valores do triângulo X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Entre com os valores do triângulo y ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();


        if(x.area() > y.area()){
            System.out.println("Primeiro triângulo maior");
        }else{
            System.out.println("Segundo triângulo Maior");
        }


        scanner.close();
    }
}
