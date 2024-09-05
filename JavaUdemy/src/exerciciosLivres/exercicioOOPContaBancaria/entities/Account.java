package exerciciosLivres.exercicioOOPContaBancaria.entities;

public class Account {
    
    private String name;
    private int accountNumber;
    private double accountCredit;

    //constructors

    public Account(String name, int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public Account(String name, int accountNumber, double initialDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountCredit = initialDeposit;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getAccountCredit(){
        return this.accountCredit;
    }
    
    //setters

    public void setName(String name){
        this.name = name;
    }

    //methods

    public void deposit(double value){
        this.accountCredit += value;
        System.out.println(this);
    }

    public void withdrawal(double value){
        if(this.accountCredit >=100){
            this.accountCredit -= value;
            this.accountCredit -= 5;
            System.out.println(this);
        }else{
            System.out.println("Out of credits");
            System.out.println(this);
        }

    }

    //tostring
    
    public String toString() {
        return String.format("Name: %s\nAccount number: %d\nAccount credits: %.2f\n", this.name, this.accountNumber,this.accountCredit);
    }
}
