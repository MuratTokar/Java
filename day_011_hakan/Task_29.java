package day_011_hakan;

public class Task_29 {

    public static void main(String[] args) {

        // print greater number
        int a=10, b=5;
        // if a>b -> a, b'den büyüktür
        // else if(b>a)-> b, a' dan büyüktür
        // else -> a ve b birbirine esittir.

        if(b<a){
            System.out.println(a + " sayisi " + b + " sayisindan büyüktür");
        } else if(a == b){
            System.out.println(a + " sayisi " + b + " sayisina esittir");
        } else { // a<b sartini biraktik
            System.out.println(b + " sayisi " + a + " sayisindan büyüktür");
        }

        if(b<a){
            System.out.println(a + " sayisi " + b + " sayisindan büyüktür");
        } else if(a<b){
            System.out.println(b + " sayisi " + a + " sayisindan büyüktür");
        } else { // a==b sartini biraktik
            System.out.println(a + " sayisi " + b + " sayisina esittir");
        }

        if(a<b){
            System.out.println(b + " sayisi " + a + " sayisindan büyüktür");
        } else if(a==b){
            System.out.println(a + " sayisi " + b + " sayisina esittir");
        } else { // b<a sartini biraktik
            System.out.println(a + " sayisi " + b + " sayisindan büyüktür");
        }

    }
}
