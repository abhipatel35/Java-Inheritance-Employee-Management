package Inheritance;

// create Employee class to use as super class as some of the details such as name, salary, age and raisesalary are same in Analyst and salesperson class.
public class Employee {

    private String name;
    protected double salary;  // make it protected otherwise it will not allow other class to call it as its not static.
    private int age;

    public Employee( String name, double salary, int age){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(){
        this.salary = this.salary * 1.2;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", 50000.0, 30);

        System.out.println("Name: " + employee1.getName());
        System.out.println("Age: " + employee1.getAge());
        System.out.println("Salary: " + employee1.getSalary());

        employee1.raiseSalary();
        System.out.println("raise in Salary:" + employee1.getSalary());
    }
}
