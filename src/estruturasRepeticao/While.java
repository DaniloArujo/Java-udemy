package estruturasRepeticao;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa que lê dois numeros até que um zero seja lido.
 * AO final mostra a soma dos numeros lidos
 */

public class While {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int soma = 0;

        while (numero != 0) {
            soma += numero;
            numero = scanner.nextInt();
        }

        System.out.println(soma);

        scanner.close();
    }
}
