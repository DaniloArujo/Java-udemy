package exerciciosLivres.composicao01.entities;

import exerciciosLivres.composicao01.entities.enums.WorkLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts(){
        return  this.contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }



    public double income(int year, int mount){
        double sum = this.baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract i : contracts){
            cal.setTime(i.getDate());
            int i_year = cal.get(Calendar.YEAR);
            int i_mounth = 1 +  cal.get(Calendar.MONTH);
            if( year == i_year && mount == i_mounth ){
                sum += i.totalValue();
            }
        }
        return sum;
    }

}
