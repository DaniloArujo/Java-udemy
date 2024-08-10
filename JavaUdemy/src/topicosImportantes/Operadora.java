package topicosImportantes;

import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de minutos: ");
        int horas = scanner.nextInt();

        int valor = 50;

        if(horas <= 100){
            System.out.printf("Valor a pagar é igual a %d",valor);
        }else{
            
            valor += (horas - 100) * 2;
            System.out.printf("Valor a pagar é igual a %d",valor);

        };

        scanner.close();
    }
}
