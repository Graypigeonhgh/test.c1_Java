package day230313.Test2;

public class SalariedEmployee extends Employee {
    private double monthlySalary;  //月工资

    public SalariedEmployee(String name,int number,MyDate birthday){
        super(name,number,birthday);
    }

    public SalariedEmployee(String name, int number, MyDate brithday, double monthlySalary) {
        super(name, number, brithday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public String toString(){
        return "SalariedEmployee["+super.toString()+"]";
    }
}
