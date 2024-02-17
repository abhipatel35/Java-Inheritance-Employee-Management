package Inheritance;

//In this class, we are using Employee as super class using "extends" keyword and also add information,
// this class also includes additional information such as commissionpercentage and raise in commissionpercentage.
public class SalesPerson extends Employee {

    private double commissionPercentage;

    public SalesPerson(String name, double salary, int age, double commissionPercentage){
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    public double raiseCommission() {
        if (commissionPercentage < 0.30) {
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
        return commissionPercentage;
    }

    public static void main(String[] args) {
        SalesPerson salesPerson1 = new SalesPerson("Alex", 700000, 28, 0.15);
        System.out.println("SalesPerson name: " + salesPerson1.getName());
        System.out.println("SalesPerson Age: " + salesPerson1.getAge());
        System.out.println("SalesPerson Salary: " + salesPerson1.getSalary());
        System.out.println("SalesPerson CommissionPercentage: " + salesPerson1.getCommissionPercentage());
        salesPerson1.raiseCommission();
        System.out.println("SalesPerson raised commission: " + salesPerson1.getCommissionPercentage());
        salesPerson1.raiseSalary();
        System.out.println("Analyst raised salary: " + salesPerson1.getSalary());
    }
}
