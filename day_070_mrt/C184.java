package day_070_mrt;

public class C184 {
}
class Rectangle{
    private double length;
    private double height;
    private double area;

    public void setLength(double length){
        this.length=length;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public void setArea(){
        area=length*height;
    }
}



/* Which two changes would encapsulate this class and ensure that the area field is always equal to length *
height whenever the Rectangle class is used?
* Hangi iki değişiklik bu sınıfı kapsar ve Rectangle sınıfı kullanıldığında alan
 alanının her zaman yüksekliğe eşit olmasını sağlar?

A. Call the setArea method at the end of the setHeight method.
A setHeight yönteminin sonundaki setArea yöntemini çağırın.

B. Call the setArea method at the beginning of the setHeight method.
B.setHeight yönteminin başında setArea yöntemini çağırın

C. Call the setArea method at the end of the setLength method.
C. setLength yönteminin sonunda setArea yöntemini çağırın

D. Call the setArea method at the beginning of the setLength method.
D. sell.ength yönteminin başında setArea yöntemini çağırın

E. Change the setArea method to private
E. detArea yöntemini özel olarak değiştirin.

F Change the are field to public
F Alan alanını genel olarak değiştirin



// cevap=A C

















Cevap:
* */
