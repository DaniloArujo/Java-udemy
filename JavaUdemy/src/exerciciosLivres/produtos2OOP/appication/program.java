package exerciciosLivres.produtos2OOP.appication;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.produtos2OOP.entities.Product;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.print("Enter with product name: ");
        product.name = scanner.nextLine();

        System.out.print("Enter with product price: ");
        product.price = scanner.nextDouble();

        System.out.print("Enter with product quantity: ");
        product.quantity = scanner.nextInt();

        System.out.println(product);

        scanner.close();
    }
}
