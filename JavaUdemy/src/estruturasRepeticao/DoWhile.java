package estruturasRepeticao;

import java.util.Scanner;

/*Fazer um programa para ler uma temperatura em célsius e mostrar o equivalente em
 * Farenheight. Perguntar se o usuário deseja repetir (S/N). Caso o usuário digite "S",
 * /repetir o programa.
*/

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char var;

        do {
            
            System.out.print("Entre com o valor a ser convertido: ");
            double c = scanner.nextDouble();



            double f = ((9*c)/5) + 32;

            System.out.printf("Equivalente em Fahrenheight: %f",f);
            System.out.println();
            System.out.println("Deseja reiniciar o programa ? (s/n)");
            var = scanner.next().charAt(0);
        } while (var != 'n');

        scanner.close();
    }    
}
