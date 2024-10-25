package exerciciosLivres.exercicioOOPContaBancaria.application;

import java.util.Locale;

import exerciciosLivres.exercicioOOPContaBancaria.entities.Account;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        Account account = new Account("Danilo", 01, 200.00);

        System.out.print(account);
        
        System.out.println("#################\n");

        account.deposit(2000.00);

        System.out.println("################\n");

        account.withdrawal(200.00);
    }
    
}
