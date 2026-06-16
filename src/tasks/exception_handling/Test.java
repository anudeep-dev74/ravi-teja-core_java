package tasks.exception_handling;

import java.util.Scanner;
class Handling {
    public static void tiMethod(int num) throws Exception{
       try {
           System.out.println("1000");
           tilMethod(num);
           System.out.println("Coders");
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
    public static void tilMethod(int num){
        try{
            int result = 100 / num;
            System.out.println("Result: " + result);
            System.out.println("Completed");
        } catch (Exception e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }finally {
            System.out.println("Finally");
        }
    }
}
public class Test {
    static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = input.nextInt();
        Handling.tiMethod(num);
    }
}
