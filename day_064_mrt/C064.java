package day_064_mrt;

public class C064 {
    public static void main(String[] args) {
        System.out.println("Hello " + new StringBuilder("Java SE 8"));// stringBuilder in kendi toString methodu var
        System.out.println("Hello " + new MyString("Java SE 8"));// toString i ollmadigi icin referans degeri getirecek

        // CEVAP=Hello Java SE 8
        //        Hello p1.MyString@<<hashcode>>

    }
}

class MyString{
    String msg;
    MyString(String msg){
        this.msg=msg;

    }


 //   public String toString() { // toString olustursam ikinci satirda referans degil ilki gibi yazacak
 //       return msg;


    }


