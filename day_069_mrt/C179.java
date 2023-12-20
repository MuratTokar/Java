package day_069_mrt;

public class C179 {
    public static void main(String[] args) {
        Test check1=new Test();
        Test check2=new Test();
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count + ":" + check2.count);


    }
}class Test{
    static int count=0;
    int i=0;

    public void changeCount(){
        while (i<5){     // 1.obje icin i ve count 5 oldu-Count static oldugu icin 2.obje icin count 5 ten baslar
                         // i  0 dan baslar ve tekrar 5 artar ve sonuc 10 olur
            i++;
            count++;
        }
    } // Cevap=B (10:10)

}

