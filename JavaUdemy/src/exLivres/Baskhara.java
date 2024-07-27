package exLivres;

import java.util.Scanner;

public class Baskhara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.print("Entre com o valor A: ");
        a = scanner.nextDouble();

        double b;
        System.out.print("Entre com o valor B: ");
        b = scanner.nextDouble();

        double c;
        System.out.print("Entre com o valor C:");
        c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta >= 0) {
            double root1 = (-b + Math.sqrt(delta)) / 2 * a;
            double root2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.printf("As raizes da equação são %.2f e %.2f respectivamente", root1, root2);
        } else {
            System.out.println("O numero não possue raizes reais");
        }

        scanner.close();
    }
}

// -b +- raiz b