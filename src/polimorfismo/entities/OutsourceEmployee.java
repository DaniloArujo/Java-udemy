package polimorfismo.entities;

public class OutsourceEmployee extends Employee{

    private Double additionalCharge;

    public OutsourceEmployee(){

    }

    public OutsourceEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge){
        super(name,hour,valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return this.hours * this.valuePerHour  * 1.10;
    }
}
