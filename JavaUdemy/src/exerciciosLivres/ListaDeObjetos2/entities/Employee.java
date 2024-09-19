package exerciciosLivres.ListaDeObjetos2.entities;

public class Employee {
    
    Integer id;
    String name;
    Double salario;

    public Employee(int id, String name, Double salario){
        this.id = id;
        this.name = name;
        this.salario = salario;
    };

    public int getIt(){
        return this.id;
    };

    public void setId(int id){
        this.id = id;
    };

    public String getName(){
        return this.name;
    };

    public void setName(String name){
        this.name = name;
    };

    public double getSalario(){
        return this.salario;
    }


    //methods

    public void increaseSalary(int percent){
        this.salario += (salario*percent/100);
    }

}
