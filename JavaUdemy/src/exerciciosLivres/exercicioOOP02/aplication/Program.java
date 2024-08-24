package exerciciosLivres.exercicioOOP02.aplication;

import java.util.Locale;

import exerciciosLivres.exercicioOOP02.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();
        employee.name = "joão Silva";
        employee.grossSalary = 6000.00;
        employee.tax = 1000.00;

        System.out.println(employee);

        employee.increasesalary(10);

        System.out.println(employee);

    }
}
