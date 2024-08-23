package exerciciosLivres.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com os valores do triângulo X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Entre com os valores do triângulo y ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();


        double pX = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC) );

        double pY = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC) );


    if(areaX > areaY){
        System.out.println("Primeiro triângulo maior");
    }else{
        System.out.println("Segundo triângulo Maior");
    }



        System.out.println("Entre com os valores do triângulo X: ");


        scanner.close();
    }
}
