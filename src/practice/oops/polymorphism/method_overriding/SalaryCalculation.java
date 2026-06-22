package practice.oops.polymorphism.method_overriding;
class Employee{
    public double calculateSalary(){
        return 0;
    }
}
class Developer extends Employee {
    @Override
    public double calculateSalary(){
        return 700000;
    }
}
class Tester extends Employee {
    @Override
    public double calculateSalary(){
        return 50000;
    }
}
class Manager extends Employee{
    @Override
    public double calculateSalary(){
        return 100000;
    }
}
public class SalaryCalculation {
    static void main(String[] args) {
        Employee dev = new Developer();
        Employee tester = new Tester();
        Employee manager = new Manager();
        System.out.println("Developer Salary is " + dev.calculateSalary());
        System.out.println("Tester Salary is " + tester.calculateSalary());
        System.out.println("Manager Salary is " + manager.calculateSalary());
    }
}
