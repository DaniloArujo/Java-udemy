package Heranca.application;

import Heranca.entities.SavingsAccount;
import exerciciosLivres.heranca01.entities.Account;
import exerciciosLivres.heranca01.entities.BusinessAccount;

public class Application {
    public static void main(String[] args) {

        Account acc = new Account(1,"Alex",0.0);
        BusinessAccount bacc = new BusinessAccount(2,"Danilo",4000.00,4000.00);

        //upcasting
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1,"lucas",200.0,400.00);
        SavingsAccount acc3 = new SavingsAccount(4,"maria",20.00,2.00);

        //dwoncasting

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.000);

        

        System.out.println(acc);
        System.out.println(bacc);

    }
}
