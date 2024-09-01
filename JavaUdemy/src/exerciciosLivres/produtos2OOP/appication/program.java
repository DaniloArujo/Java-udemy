package exerciciosLivres.produtos2OOP.appication;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.produtos2OOP.entities.Product;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        

        System.out.print("Enter with product name: ");
        String name = scanner.nextLine();

        System.out.print("Enter with product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter with product quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(name,price,quantity);

        System.out.println(product);

        scanner.close();
    }
}
