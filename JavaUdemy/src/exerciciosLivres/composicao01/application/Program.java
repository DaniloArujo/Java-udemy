package exerciciosLivres.composicao01.application;

import exerciciosLivres.composicao01.entities.Department;
import exerciciosLivres.composicao01.entities.HourContract;
import exerciciosLivres.composicao01.entities.Worker;
import exerciciosLivres.composicao01.entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Base salary: ");
        Double workerBaseSalary = scanner.nextDouble();scanner.nextLine();

        Worker worker = new Worker(workerName, WorkLevel.valueOf(workerLevel),workerBaseSalary,new Department(departmentName));

        System.out.println("How many contracts to this worker ?");
        int n = scanner.nextInt();scanner.nextLine();

        for(int i = 1; i <= n; i++){
            System.out.printf("Enter contract #%d: ",i);

            System.out.print("Date (DD/MM/AA): ");
            Date contractdate = sdf.parse(scanner.next());

            System.out.print("value per hour: ");
            double valuePerHour = scanner.nextDouble();

            System.out.print("Duration (Hours): ");
            int hours = scanner.nextInt();

            HourContract contract = new HourContract(contractdate,valuePerHour,hours);

            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY)");
        String mountAndYear = scanner.next();

        int month = Integer.parseInt(mountAndYear.substring(0,2));
        int year = Integer.parseInt(mountAndYear.substring(3));

        System.out.printf("Name: %s\n", worker.getName());
        System.out.printf("Department: %s\n", worker.getDepartment().getName());
        System.out.printf("Income for %.2s: %f",mountAndYear,worker.income(year,month));


    }
}
