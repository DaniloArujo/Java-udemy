package exerciciosLivres.arrayDeObjetos2.entities;

public class User {

    private String name;
    private Integer accountNumber;
    private Double accountCredits;

    // constructors
    public User(String name, int accountNumber, double credits){
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountCredits = credits;
    }

    public User(String name, int accountNumber){
        this.name = name;
        this.accountNumber = accountNumber;
    }

    //getters & setters

        //name
        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        //accountNumber
        public int getAccountNumber(){
            return this.accountNumber;
        };

        //credits
        public double getAccountCredits(){
            return this.accountCredits;
        }

    //methods

    public void addCredits(int value){
        this.accountCredits += value;
        System.out.println(this);
    }

    public void withdrawal(int value){
        this.accountCredits -= value + 5;
        System.out.print(this);
    }

    //tostring
    public String toString() {
        return "User [name=" + name + ", accountNumber=" + accountNumber + ", accountCredits=" + accountCredits + "]";
    } 

}
