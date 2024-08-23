package exerciciosLivres.produtosOOP.entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return String.format("product data: %s, R$%.2f, %d units, total: %.2f\n",name,price,quantity,totalValueInStock());
    }
}
