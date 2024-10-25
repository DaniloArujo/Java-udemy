package estruturasRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de numeros a ser somada: " );
        int quantidade = scanner.nextInt();

        int soma = 0;

        for(int i = 0; i < quantidade; i++){
            System.out.printf("Entre com o %dº valor: ",i+1);
            int novo =  scanner.nextInt();
            soma += novo;
        }

        System.out.printf("A soma dos itens é %d",soma);

        scanner.close();
    }
}
