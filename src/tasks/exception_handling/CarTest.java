package tasks.exception_handling;

import java.util.Scanner;

class CarStopped extends Exception{
    public CarStopped(String message){
        super(message);
    }
}
class CarPuncture extends Exception{
    public CarPuncture(String message){
        super(message);
    }
}
class CarHeat extends Exception{
    public CarHeat(String message){
        super(message);
    }
}
public class CarTest {
    public static void stop(String input) throws CarStopped{
        if(input.equals("stop")){
            throw new CarStopped("Car is Stopped");
        }
        System.out.println("Car is not installed");
    }
    public static void puncture(String input) throws CarPuncture{
        if(input.equals("puncture")){
            throw new CarPuncture("Car is Punctured");
        }
        System.out.println("Car is not Punctured");
    }
    public static void carHeat(int teamperature) throws CarHeat{
        if(teamperature > 50){
            throw new CarHeat("Car is heated more than 50 degrees");
        }
        System.out.println("Car is not installed");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String message = input.next();
        System.out.println("Enter the temperature: ");
        int temperature = input.nextInt();
        try{
            stop(message);
            puncture(message);
            carHeat(temperature);
        }catch (CarStopped cs){
            System.out.println("Car Stopped : " + cs.getMessage());
        } catch (CarPuncture e) {
            System.out.println("Car Punctured : " + e.getMessage());
        } catch (CarHeat e){
            System.out.println("Car Headted : " + e.getMessage());
        }
    }
}
