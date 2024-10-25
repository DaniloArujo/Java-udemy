package exerciciosLivres.arrayDeObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.arrayDeObjetos.entities.User;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o tamanho do array");
        int size = scanner.nextInt(); scanner.nextLine(); 

        User[] list = new User[size];

        for(int i = 0; i < list.length; i++){

            System.out.print("Entre com o nome: ");
            String name = scanner.nextLine();

            System.out.print("Entre com a idade: ");
            int idade = scanner.nextInt();scanner.nextLine();

            list[i] = new User(name,idade);

            System.out.println(list[i]);
        }
 
        double sum = 0;
        for(User user : list){
            sum += user.getIdade();
        }


        System.out.println(sum/list.length);

        scanner.close();
    }
}
