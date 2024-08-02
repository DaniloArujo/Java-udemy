package estruturaCondicional;

import java.util.Scanner;

/*Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia
 * da semana (sendo 1 = domingo, 2 = segunda, e assim por diante).
 * Escrever na tela o dia da semana correspondente.
 */

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o valor: ");
        int valor = scanner.nextInt();
        
        if (valor < 1 || valor > 7) {
            System.out.println("Entrada inválida");    
            System.exit(0);
        }
        
        switch (valor) {
            case 1:{
                System.out.println("Domingo");
            }   
                break;
            
            case 2:{
                System.out.println("Segunda");
            }
                break;
            case 3:{
                System.out.println("Terça");
            }
                break;
            case 4:{
                System.out.println("Quarta");
            }
                break;
            
            case 5:{
                System.out.println("Quinta");
            }
                break;

            case 6:{
                System.out.println("Sexta");
            }
                break;
            
            case 7:{
                System.out.println("Sabado");
            }
                break;
            
        };


        scanner.close();
    }
}
