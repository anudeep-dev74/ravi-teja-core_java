package classes.anonymous_functional_interfaces;


import java.util.function.Consumer;
import java.util.function.Predicate;

public class Employee {
    String employeeName;
    String employeeDesg;
    double employeeSalary;

    Employee(String employeeName, String employeeDesg, double employeeSalary){
        this.employeeName = employeeName;
        this.employeeDesg = employeeDesg;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString(){
        return "Employee Name - " + employeeName
        + "Employee Salary : " + employeeSalary;
    }

    public void setString(String employeeName){
        this.employeeName = employeeName;
    }
    public void setEmployeeDesg(String employeeDesg){
        this.employeeDesg = employeeDesg;
    }
    public void setEmployeeSalary(double employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    public String getEmployeeDesg(){
        return employeeDesg;
    }
    public double getEmployeeSalary(){
        return employeeSalary;
    }
    static void main(String[] args) {
        Employee emp = new Employee("Anudeep", "Dev", 4000.56);
        Employee emp1 = new Employee("Kushal", "Tester", 55000);
        Employee emp2 = new Employee("Nailesh", "DevOps", 48000);

        Predicate<Employee> salaryCheck = new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return emp.getEmployeeSalary() > 10;
            }
        };
        Consumer<Employee> c = new Consumer<Employee>() {
            @Override
            public void accept(Employee employee) {
                emp.setEmployeeSalary(emp.getEmployeeSalary() + emp.getEmployeeSalary() * 0.10);
            }
        };

        Employee[] emp_arr = {emp, emp1, emp2};
        for(Employee e: emp_arr){
            if(salaryCheck.test(e)){
                c.accept(e);
            }
            System.out.println(e);
        }

    }
}
