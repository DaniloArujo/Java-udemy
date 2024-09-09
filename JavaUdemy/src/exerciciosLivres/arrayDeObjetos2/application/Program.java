package exerciciosLivres.arrayDeObjetos2.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.arrayDeObjetos2.entities.User;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o numero de contas: ");
        int size = scanner.nextInt();scanner.nextLine();
        User[] lista = new User[size];

        for(int i = 0; i < lista.length; i++){
            System.out.print("name: ");
            String name = scanner.nextLine();

            System.out.print("account number: ");
            int idade = scanner.nextInt();scanner.nextLine();

            User tempUser = new User(name, idade);
            lista[i] = tempUser;
        }

        for(int i = 0; i < lista.length; i++){
            System.out.println(lista[i]);
        }


        scanner.close();
    }
}
