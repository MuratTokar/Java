package day_062_hakan;

public class Q21 {
    public static void main(String[] args) {
        Vehicle3 v = new Bus();
    }
}

class Vehicle3{
    Vehicle3(){
        System.out.println("Vehicle");
    }
}

class Bus extends Vehicle3{
    Bus(){
        // super(); burada gizli super constructor method cagriliyor
        System.out.println("Bus");
    }
}

// Vehicle
// Bus

