package encapsulamento.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // getters
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    // setters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    // construtores
    public Product() {
    }

    public Product(String name){
        this.name = name;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    

    // métodos
    public double totalValueInStock(){
        return this.price * this.quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }


    //toString
    public String toString(){
        return String.format("name: %s \nprice: %.2f\nquantity: %d\nvalue in stock: %.2f\n", getName(), getPrice(),getQuantity(), totalValueInStock());
    }
}
