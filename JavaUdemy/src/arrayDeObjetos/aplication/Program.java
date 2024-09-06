package arrayDeObjetos.aplication;

import java.util.Locale;
import java.util.Scanner;

import arrayDeObjetos.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o numero de itens: ");
        int size = scanner.nextInt();scanner.nextLine();

        Product[] lista = new Product[size];


        for(int i = 0; i < size; i++){
            System.out.printf("Entre com o nome: ");
            String nome = scanner.nextLine();
            System.out.printf("Entre com o valor: ");
            double price = scanner.nextDouble();scanner.nextLine();

            lista[i] = new Product(nome, price);
            System.out.println(lista[i]);
        }


        double sum = 0;

        for(int i = 0; i < size; i++){
            sum += lista[i].getPrice();
        }

        System.out.printf("media: %f",sum/size);





        scanner.close();
    }
}
