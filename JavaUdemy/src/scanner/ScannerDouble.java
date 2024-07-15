package scanner;

import java.util.Locale;
import java.util.Scanner;

public class ScannerDouble {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um double: ");
        double x = scanner.nextDouble();

        System.out.printf("O numero digitado foi: %.2f",x);

        scanner.close();

    }
}
