package sobreposicao.entities;

public class SavingsAccount extends Account{

    public Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate(){
        return  interestRate;
    }

    public void setInterestRate(Double interestRate){
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance + interestRate;
    }

    @Override
    public final void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
        //balance -= amount;
        //super.withdraw(amount);
    }
}
