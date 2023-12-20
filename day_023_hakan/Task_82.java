package day_023_hakan;

import java.util.Scanner;

public class Task_82 {

    /**
     * Login Functionality Logic
     * • UserName,Password
     * • --- > Program will ask to enter username and password
     * • --- > If both username and password are blank
     * • "UserName and Password Fields cannot be empty"
     * • --- > If userName is blank and password is not blank
     * • "UserName cannot be empty"
     * • --- > If userName is not blank and password is blank
     * • "Password cannot be empty"
     * • --- > If the username or password is not valid
     * • "UserName or password is not valid. Please verify"
     * • --- > If the username and password are both valid
     * • "User Logged in successfully"
     */


    public static void main(String[] args) {
        String usernameOriginal = "java_user";
        String passwordOriginal = "123_user(";


        Scanner input = new Scanner(System.in);
        System.out.print("Kullanici Adi : ");
        String username = input.nextLine();
        System.out.print("Paralo : ");
        String password = input.nextLine();

        if(username.isEmpty() && password.isEmpty()){
            System.out.println("UserName and Password Fields cannot be empty");
        } else if(username.isEmpty()){
            System.out.println("UserName cannot be empty");
        } else if(password.isEmpty()){
            System.out.println("Password cannot be empty");
        } else if( !username.equals(usernameOriginal) || !password.equals(passwordOriginal) ){
            System.out.println("UserName or password is not valid. Please verify");
        } else if(username.equals(usernameOriginal) && password.equals(passwordOriginal)){
            System.out.println("User Logged in successfully");
        }

    }


}