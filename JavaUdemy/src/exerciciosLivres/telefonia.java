package exerciciosLivres;

import java.util.Scanner;

/*
 * uma operadora de telefonia cobra 50R$ por um plano básico que dá direito
 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 
 * minutos custa 2R$. fazer um programa para ler a quantidade de minutos
 * que uma pessoa consumiu, daí mostrar o valor a ser pago.
 */

public class telefonia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entre com a quantidade de minutos: ");
        int minutos = scanner.nextInt();

        int valor;

        if (minutos <= 100) {
            valor = 50;
        }else{
            valor = 50 + ((minutos - 100) * 2);
        }
        
        System.out.printf("Valor a pagar: R$%d.00",valor);

        scanner.close();
    }
    
}