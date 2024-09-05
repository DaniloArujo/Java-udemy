package exerciciosLivres.exercicioOOPContabancária2.aplication;

import exerciciosLivres.exercicioOOPContaBancaria.entities.Account;

public class Program {
    public static void main(String[] args) {
        Account account = new Account("Danilo Araujo Mota", 001, 2000.50);

        System.out.println(account);

        account.setName("Eduardo antonio");

        System.out.println(account);

        account.deposit(2000);
        account.withdrawal(2000);

    }
}
