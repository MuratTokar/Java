package day_49_murat;

public enum USER {
    STUDENT("student@gmail.com","123456st",2),

    DINSTRUCTOR("insructor@gmail.com","123456in",4),


    DIRECTOR("director@gmail.com","123456dir",5);




    final private String USERNAME;
    final private String PASSWORD;
    final private int ACCES_LEVEL;

    USER(String username,String password,int access_level){
        this.USERNAME=username;
        this.PASSWORD=password;
        this.ACCES_LEVEL=access_level;

    }
    public String getusername(){
        return USERNAME;
    }
    public String getpassword(){
        return PASSWORD;

    }
    public int getacces_level(){
        return ACCES_LEVEL;
    }

}
