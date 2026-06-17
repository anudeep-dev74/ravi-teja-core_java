package classes.exception_handling;

class InvalidAgeofVechileEception extends Exception {
    public InvalidAgeofVechileEception(String message){
        super(message);
    }
}
class InvalidAgeofTireEception extends Exception {
    public InvalidAgeofTireEception(String message){
        super(message);
    }
}
class InvalidAgeOfEngineException extends Exception {
    public InvalidAgeOfEngineException(String message){
        super(message);
    }
}
class Vechile {
    public static void checkage(int ageOfVechile, int ageOfTire, int ageOfEngine) throws InvalidAgeofVechileEception, InvalidAgeofTireEception, InvalidAgeOfEngineException {
        if(ageOfVechile > 10){
            throw new InvalidAgeofVechileEception("Vechile age should not exceed to above 10 years");
        }else if(ageOfTire > 2){
            throw new InvalidAgeofTireEception("The age of should not exceed to above 2 years");
        } else if (ageOfEngine > 15) {
            throw new InvalidAgeOfEngineException("The age of engine should not exceed to above 15 years");
        }
    }
    static void main(String[] args) {
        try {
            checkage(15, 3, 25);
        } catch (InvalidAgeofVechileEception | InvalidAgeofTireEception | InvalidAgeOfEngineException e) {
            e.printStackTrace();
        }
    }
}
