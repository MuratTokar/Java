package day_045_hakan;

public class UserDefinedException extends Exception{

    // throw new Exception("message");
    UserDefinedException(){
        super("My exception");
    }

    UserDefinedException(String message){
        super(message);
    }

}
