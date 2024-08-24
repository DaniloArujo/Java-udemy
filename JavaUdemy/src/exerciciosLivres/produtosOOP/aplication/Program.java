package exerciciosLivres.produtosOOP.aplication;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.produtosOOP.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data:");
        
        System.out.print("Name: ");
        product.name = scanner.nextLine();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = scanner.nextInt();

        //O java implicitamente chama a função toString nesses casos em que eu imprimo uma String
        System.out.println(product + "\n");

        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);


        System.out.println("\n");
        System.out.println(product);


        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println("\n");
        System.out.println(product);

        scanner.close();
    }
}
