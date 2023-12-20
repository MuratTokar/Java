package day_019_hakan;

public class CreatingObjects {
    public static void main(String[] args) {
        // object creation
        Task_Employee workerA = new Task_Employee();
        // className objectName = new className();
        workerA.attendMeeting();
        Task_Employee.classtanCagir();

        int a;

        a = 5;
        a = 10;






        System.out.println(a); // 10



        Cars carA = new Cars();
        carA.model="Touran";
        carA.motorGucu="2.0 TDI";
        carA.uretimYili=2020;
        carA.yakitTuru="Diesel";
        carA.renk = "Beyaz";

        Cars carB = new Cars();
        carB.model="Sharan";
        carB.motorGucu="2.2 TDI";
        carB.uretimYili=2023;
        carB.yakitTuru="Benzin";
        carB.renk = "Kirmizi";

        carA.printInfo();
        System.out.println("*********************************");
        carB.printInfo();
        System.out.println("*********************************");

        System.out.println(carA.model);
        System.out.println(carB.model);

    }
}
