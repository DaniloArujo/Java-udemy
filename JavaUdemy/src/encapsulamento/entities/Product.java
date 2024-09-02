package encapsulamento.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //getters

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //construtores
    public Product(){
    }

    public Product(String name){
        setName(name);
    }

    public Product(String name, double price){
        setName(name);
        setPrice(price);
    }

    public Product(String name, double price, int quantity){
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }


    //methodos

    public double totalValueInStock(){
        return getPrice() * getQuantity();
    }

    public void addProducts(int quantity){
        setPrice(getPrice() + quantity);
    }

    public void removeProducts(int quantity){
        setQuantity(getQuantity() - quantity);
    }

    public String toString(){
        return String.format("name: %s \nprice: %.2f\nquantity: %d\nvalue in stock: %.2f\n", getName(),getPrice(),getQuantity(),totalValueInStock());
    }
}
