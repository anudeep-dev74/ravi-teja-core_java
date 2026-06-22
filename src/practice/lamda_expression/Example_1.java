package practice.lamda_expression;

@FunctionalInterface
interface Car {
    public void drive();
}

class Audi implements Car{
    @Override
    public void drive(){
        System.out.println("Driving Audi Car");
    }
}

public class Example_1 {
    static void main(String[] args) {

    }
}
