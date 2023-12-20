package day_062_mrt;

public class C034 {
    static double area;// default degeri =0
    int b=2; // obje variable
    int h=3;// static methodun icinde bunlara ulasilmaz

    public static void main(String[] args) {
        double p,b,h;     // line n1
        if (area==0){ // area =0 ise if calisir
            b=3;
            h=4;
            p=0.5;
            area=p*b*h; // line n2
            //3*4*0,5=6.0 double oldugu icin



        }
        System.out.println("Area is " + area);// 6.0
    }
}
