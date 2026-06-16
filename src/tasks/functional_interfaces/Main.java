package tasks.functional_interfaces;

@FunctionalInterface
interface NumberChecker {
    public boolean checkNumber(int num);
}
@FunctionalInterface
interface CharChecker{
    public void checkChar(char ch);
}

public class Main {
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
        NumberChecker nc = new NumberChecker() {
            @Override
            public boolean checkNumber(int num) {
                return isPrime(num);
            }
        };
        System.out.println(nc.checkNumber(7));

        CharChecker cc = new CharChecker() {
            @Override
            public void checkChar(char ch) {
                int ascii = (int) ch;
                if(isPrime(ascii)){
                    System.out.println(ascii + "is prime");
                }else {
                    System.out.println(ascii + " is not prime");
                }
            }
        };
        cc.checkChar('B');
    }
}
