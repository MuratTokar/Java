package day_067_mrt;

public class C128 {
    public static void main(String[] args) {
        Myfiled m1=new Myfiled();
        m1.x=100;
        m1.y=200;
        Myfiled m2=new Myfiled();
        m2.doStuff(m1.x,m1.y); // alltaki lokal variableden dolayi bu bir islem yapmiyor.
        m1.display(); // m1 x=100 , m1 y=200
        m2.display();// m2 x= 0 yani default deger,m2 y=0  yani default deger.En ustten aldi
    }
}
 class Myfiled{
    int x;
    int y;
    public void doStuff(int x,int y){// Aldatmaca olarak verilmis
        x=x; // bunlar lokal variable ve bir islem yapmiyor
        y=this.y;
    }
    public void display(){
        System.out.print(x + " " + y + ":") ;
    }
}
// Cevap=A (100 200:0 0:)
