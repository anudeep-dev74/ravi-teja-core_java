package practice.oops.polymorphism;
class Employee {
    int empId;
    String empName;
    public Employee(int empId, String empName){
        this.empId = empId;
        this.empName = empName;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}
class Developer extends Employee {
    String progLang;
    public Developer(int empId, String empName, String progLang){
        super(empId, empName);
        this.progLang = progLang;
    }
    public void writeCode(){
        System.out.println(empName + " is developing an application using " + progLang);
    }
}
class Tester extends Employee {
    String testingTools;
    public Tester(int empId, String empName, String testingTools){
        super(empId, empName);
        this.testingTools = testingTools;
    }
    public void testing(){
        System.out.println(empName + " is testing an application using testing tool is " + testingTools);
    }
}
class Manager extends Employee {
    int teamSize;
    public Manager(int empId, String empName, int teamSize){
        super(empId, empName);
        this.teamSize = teamSize;
    }
    public void manageTeam(){
        System.out.println(empName + " is managing the team with team size of " + teamSize + " members");
    }
}
public class Company {
    static void main(String[] args) {
        Employee e;
        e = new Developer(101, "Anudeep", "Java");
        e.displayEmployeeDetails();
        ((Developer) e).writeCode();
        System.out.println("----------------------------------------------");
        e = new Tester(102, "Sandeep", "Selenium");
        e.displayEmployeeDetails();
        ((Tester) e).testing();
        System.out.println("----------------------------------------------");
        e = new Manager(103, "Narendra", 100);
        e.displayEmployeeDetails();
        ((Manager) e).manageTeam();
    }
}
