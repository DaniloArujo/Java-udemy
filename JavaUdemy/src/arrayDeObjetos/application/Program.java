package arrayDeObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import encapsulamento.entities.Product;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com a quantidade de itens: ");
        int arrayLenght = scanner.nextInt();scanner.nextLine();


        Product[] lista = new Product[arrayLenght];

        for(int i = 0; i < arrayLenght; i++){
            Product temp = new Product();
            

            System.out.print("Entre com o nome: ");
            String name = scanner.nextLine();
            temp.setName(name); 

            System.out.print("Entre com o valor: ");
            double value = scanner.nextDouble();scanner.nextLine();
            temp.setPrice(value);


            lista[i] = temp;
        }


        double soma = 0;

        for(int i = 0; i < arrayLenght; i++){
            soma += lista[i].getPrice();
        }


        System.out.printf("%f",soma/arrayLenght);

        scanner.close();
    }
}
