package classes.exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    static void main(String[] args) {
        try {
            FileReader fr = new FileReader("config.txt");
            System.out.println("file Opened");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
