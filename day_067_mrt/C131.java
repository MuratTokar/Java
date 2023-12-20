package day_067_mrt;

public class C131 {
    public static void main(String[] args) {
        Vehicle y=new Car();
        System.out.println(y); // Vehicle de toString olmadigi icin  referans deger veririr
    }
}
class Vehicle{
    int x;
    Vehicle(){
        this(10);  // line n1
    }
    Vehicle(int x){
        this.x=x;
    }
}
class  Car extends Vehicle{
    int y;
    Car(){
        super();
     //   this(20);    // line n2 // ayni anda iki constructor metot cagrilamaz
    }
    Car(int y){
        this.y=y;
    }
    public String toString(){
        return super.x + ":" + this.y;
    }
    // Cevap=D (Compilation fails at line n2)
}
