package day_24_murat.lab;

public class Q_8 {
    public static void main(String[] args) {
        // bir arryin icersiinde 2 veya 3 elemani olup olmadigini kontrol eden program
        int[] sayi={1,5,7,2};
        boolean cantainsTwo=false;

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i]==2 || sayi[i]==3){
               cantainsTwo=true;
                break;                     // falss olunca da yazsin istersek boolean acariz
            }

        }
        System.out.println(cantainsTwo);
    }
}
