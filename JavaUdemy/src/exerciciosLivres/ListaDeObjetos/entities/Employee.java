package exerciciosLivres.ListaDeObjetos.entities;

public class Employee {
    
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    //getters & setters

    //name
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    //id
    public int getId(){
        return this.id;
    }

    //salary
    public double getSalary(){
        return this.salary;
    }







}
