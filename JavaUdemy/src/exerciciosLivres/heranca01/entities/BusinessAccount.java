package exerciciosLivres.heranca01.entities;

public class BusinessAccount extends Account{

    Double LoanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        LoanLimit = loanLimit;
    }

    public void loan(Double amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "LoanLimit=" + LoanLimit +
                "} " + super.toString();
    }
}
