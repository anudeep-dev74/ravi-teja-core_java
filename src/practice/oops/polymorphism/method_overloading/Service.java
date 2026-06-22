package practice.oops.polymorphism.method_overloading;
class EmployeeService{
    public void searchEmployee(int empId){
        System.out.println("Searching an employee using Employee ID : " + empId);
    }
    public void searchEmployee(String email){
        System.out.println("Searching an employee using the email : " + email);
    }
    public void searchEmployee(String firstName, String lastName){
        System.out.println("Searching an employee using firstName : " + firstName + " and lastName: " + lastName);
    }
}
public class Service {
    static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.searchEmployee(100);
        service.searchEmployee("anudeep@gmail.com");
        service.searchEmployee("Anudeep", "Pusapati");
    }
}
