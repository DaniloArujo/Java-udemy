package exerciciosLivres;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio001 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);   

        System.out.print("Largura: ");
        double largura = scanner.nextDouble();

        System.out.print("comprimento: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Metro Quadrado: ");
        double metroQuadrado = scanner.nextDouble();


        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.err.printf("AREA : %.2f\n",area);

        System.err.printf("PREÇO : %.2f\n",preco);
        scanner.close();

    }   
}
