package exerciciosLivres.ListaDeObjetos.entities;

public class Employee {
    
    private String name;
    private Integer id;
    private Double salary;


    public Employee(){

    }

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

    //methods

    public void increaseSalary(double percentage){
        this.salary += this.salary * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }




}
