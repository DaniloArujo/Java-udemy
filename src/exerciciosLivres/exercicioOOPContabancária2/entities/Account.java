package exerciciosLivres.exercicioOOPContabancária2.entities;

public class Account {
    
    private String name;
    private int accountNumber;
    private double accountCredits;


    //constructors

    public Account(String name, int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public Account(String name, int accountNumber, double accountCredits){
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountCredits = accountCredits;
    }

    //getters

    public String getName(){
        return this.name;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double GetAccountCredits(){
        return this.accountCredits;
    }

    //setters

    public void setName(String name){
        this.name = name;
    }

    //methods

    public void deposit(double value){
        this.accountCredits += value;
        System.out.println(this);
    }

    public void withdraw(double value){
        if(accountCredits <= 100){
            System.out.println("Not enought cash");
            return;
        }else{
            this.accountCredits -= value + 5;
            System.out.println(this);
        }
    }


    //tostring

    public String toString(){
       
        return String.format("Name: %s\nAccount number: %d\nAccount credits: %.2f\n",this.name,this.accountNumber,this.accountCredits);
    }
}
