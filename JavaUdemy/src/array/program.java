package array;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o tamanho do array: ");
        int arrayLenght = scanner.nextInt();

        int [] vetor = new int[arrayLenght];
        int soma = 0;;

        for(int i = 0; i < arrayLenght; i++){
            System.out.printf("Entre com o %dº numero: ",i + 1);
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        double media = (double) soma /arrayLenght;


        System.out.println(media);

        scanner.close();
    }
}
