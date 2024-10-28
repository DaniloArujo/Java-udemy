package sobreposicao.application;

import sobreposicao.entities.Account;
import sobreposicao.entities.SavingsAccount;

public class Application {
    public static void main(String[] args) {

        Account acc1 = new Account(1001,"alex",2000.00);
        acc1.withdraw(200.00);
        System.out.println(acc1.getBalance());

        System.out.println("################");

        Account acc2 = new SavingsAccount(1002,"Maria",2000.00,0.01);
        acc2.withdraw(200.00);
        System.out.println(acc2.getBalance());
    }
}
