package day_061_hakan;

public class Q18 {
    public static void main(String[] args) {
        Car2 c1 = new Car2("Auto");
        System.out.println("1.object create edildi");
        Car2 c2 = new Car2("4W",150, "Manual");
        System.out.println("2.object create edildi");
        Car2 c3 = new Car2();

        System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans );
        System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans );
    }
}

class Vehicle2{
    String type = "4W";
    int maxSpeed = 100;

    Vehicle2(String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    Vehicle2(){
        System.out.println("Merhaba");
    }
}

class Car2 extends Vehicle2{
    String trans;

    Car2(String trans){
        // super()              // line n1
        this.trans = trans;
    }

    Car2(String type, int maxSpeed, String trans){
        super(type, maxSpeed);      // line n2
        this.trans = trans;
    }

    Car2(){
        // super();
    }
}

