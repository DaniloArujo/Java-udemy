package scanner;

import java.util.Scanner;

public class ScannerInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um numero inteiro: ");
        int x = scanner.nextInt();

        System.out.printf("O numero digitado foi %d",x);

        scanner.close();
    }
}
