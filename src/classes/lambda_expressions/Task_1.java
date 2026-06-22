package classes.lambda_expressions;

@FunctionalInterface
interface NumberChecker {
    public boolean checkNumber(int num);
}
@FunctionalInterface
interface CharChecker{
    public void checkChar(char ch);
}

public class Task_1 {
    public static boolean isPrime(int num){
        if(num <= 1)
            return false;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
        /*NumberChecker nc = (int num) -> {
                return isPrime(num);
        };*/
        NumberChecker nc = (int num) ->  isPrime(num);
        System.out.println(nc.checkNumber(7));
    }
}
