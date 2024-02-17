package Inheritance;

public class Analyst extends Employee{

    public Analyst(String name, double salary, int age){
        super(name, salary, age);
    }

    public double getAnnualBonus(){
        return this.salary * .05;
    }

    public static void main(String[] args) {

        Analyst analyst1 = new Analyst("Abhi", 650000, 24);
        System.out.println("Analyst name:" + analyst1.getName());
        System.out.println("Analyst salary:" + analyst1.getSalary());
        System.out.println("Analyst Age:" + analyst1.getAge());
        analyst1.getAnnualBonus();
        System.out.println("Analyst annualBonus:" + analyst1.getAnnualBonus());
        analyst1.raiseSalary();
        System.out.println("Analyst raised salary: " + analyst1.getSalary());
    }
}
