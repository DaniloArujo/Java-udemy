package topicosImportantes;

import java.util.Scanner;

/*
 * Fazer um programa que lê os numeros até que um zero seja lido.
 * AO final mostra a soma dos numeros lidos
 */

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        int valor = 0;

        do {
            System.out.print("Entre com o numero: ");
            valor = scanner.nextInt();
            soma += valor;
        } while (valor !=0);

        System.out.printf("A soma é igual a %d",soma);

        

        scanner.close();
    }
}
