package scanner;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com uma string: ");
        char x = scanner.next().charAt(0);

        System.out.printf("A primeira letra da string é: %c",x);

        scanner.close();
    }
}
