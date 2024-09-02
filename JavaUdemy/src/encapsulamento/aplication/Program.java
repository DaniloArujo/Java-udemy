package encapsulamento.aplication;

import java.util.Locale;

import encapsulamento.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Product product = new Product("cadeira", 200, 2);

        System.out.println(product);

        product.setName("Computer");
        product.setPrice(3000);
        product.setQuantity(0);
        product.addProducts(200);

        System.out.println(product);
    }
}
