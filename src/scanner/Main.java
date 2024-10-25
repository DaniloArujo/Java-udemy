package scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x;
        System.out.print("Digite algo: ");
        x = scanner.next();
        System.out.printf("Você digitou %s",x);




        scanner.close();
    }
}
