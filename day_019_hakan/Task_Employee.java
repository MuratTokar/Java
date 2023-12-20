package day_019_hakan;

public class Task_Employee {

    // fields
    // name, jobTitle, salary

    String name;
    String jobTitle;
    double salary;  // maas
    static int counter;

    // instance methods
    // work(), attendMeeting(), introduce()

    public void work(){
        System.out.println("Calis calis calis, para? para yok!");
    }

    public void attendMeeting(){
        System.out.println("toplantiya katiliniyor...");
    }

    public void introduce(){
        System.out.println("Kendini tanit...");
    }

    public static void classtanCagir(){
        System.out.println("Beni class tan cagirdilar");
    }



}
