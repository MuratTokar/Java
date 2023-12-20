package day_066_mrt;

public class C101 {
}
class Test{
    public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;
        numbers=new int[4];// ustteki array i yeni bir arraya atadi ve üst cöpe gitti
        numbers[2]=30; // sedce 2 ve 3. index lere deger atandi ve 0 ile 1 default degerde kaldi
        numbers[3]=40;
        for (int x:numbers){
            System.out.print(" " + x);
            // cevap= B:0 0 30 40
        }

    }
}
