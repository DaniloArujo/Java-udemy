package exerciciosLivres.produtosOOP.aplication;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.produtosOOP.entities.Product;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();
        System.out.println("Enter product data:");
        
        System.out.print("Name: ");
        product.name = scanner.nextLine();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = scanner.nextInt();

        //O java implicitamente chama a função toString nesses casos em que eu imprimo uma String
        System.out.println(product);
        
        scanner.close();
    }
}
