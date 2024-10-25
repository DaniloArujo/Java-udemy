package array;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o tamanho do array: ");
        int arrayLenght = scanner.nextInt();

        double[] vetor = new double[arrayLenght];


        double soma = 0;
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("Entre com o %dº numero: ",i + 1);
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        double media = soma /vetor.length;


        System.out.printf("%.2f",media);

        scanner.close();
    }
}
