package day_061_hakan;

public class Q13 {
    public static void main(String[] args) {
        Vehicle v = new Car(20);
        System.out.println(v);
    }
}

class Vehicle{
    int x;  //class vehicle nin obje si yani car objesini vehicle referanslai olusturduk ,car objesine 20 atadik vehicle ye de atadik
    Vehicle(){
        this(10); //parametreli constructor cagirdi// line n1
    }
    Vehicle(int x){
        this.x = x;
    }
}

class Car extends Vehicle {
    int y;
    Car(){
        super(10); // line n2
    }
    Car(int y){   // burdaki y=20
        super(y);
        this.y=y;
    }

    public String toString(){
        return super.x + ":" + this.y;
    }
}

// 20:20
