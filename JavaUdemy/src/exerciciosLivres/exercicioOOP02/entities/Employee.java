package exerciciosLivres.exercicioOOP02.entities;

public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary(){
        return grossSalary - tax;
    }

    public void increasesalary(double percent){
        grossSalary += grossSalary * (percent/100);
    }

    public String toString(){
        return String.format("Name: %s, Gross salary: %.2f, tax: %.2f",name,grossSalary - tax,tax);
    }

}
