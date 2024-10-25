package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalTernária {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o preço : ");
        double preco = scanner.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
        scanner.close();
    }
}
