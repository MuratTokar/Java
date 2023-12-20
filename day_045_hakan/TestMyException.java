package day_045_hakan;

public class TestMyException {

    public static void main(String[] args) {
        try{
            throw new UserDefinedException("new message");
        } catch(UserDefinedException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
