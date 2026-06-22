package classes.exception_handling;

public class ArithmeticExceptionExample {
    static void main(String[] args) {
        try {
            int num = 100/0;
            System.out.println("Execution Sucessfull");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
