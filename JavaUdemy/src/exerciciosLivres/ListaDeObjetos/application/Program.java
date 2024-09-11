package exerciciosLivres.ListaDeObjetos.application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exerciciosLivres.ListaDeObjetos.entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos funcionários serão registrados ? ");
        int listSize = scanner.nextInt();scanner.nextLine();
        

        System.out.println("#########################");

        List<Employee> list = new ArrayList<Employee>();

        for(int i = 0; i < listSize; i++){
            System.out.printf("Entre com nome do %dº funcionário: ",i + 1);
            String name = scanner.nextLine();

            System.out.printf("Entre com o ID do %dº funcionário: ",i + 1);
            int id = scanner.nextInt();scanner.nextLine();

            System.out.printf("Entre com o salario do %dº funcionário: ",i + 1);
            double salary = scanner.nextDouble();scanner.nextLine();

            Employee temp = new Employee(name, id, salary);

            list.add(temp);

            System.out.println("######################");
        }

        


        scanner.close();
    }
}
