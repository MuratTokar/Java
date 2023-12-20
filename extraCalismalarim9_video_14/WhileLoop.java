package extraCalismalarim9_video_14;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        * baslangic ve bitis degeri belli olan veya kac kere tekrar edilecegi bilinen
        *  looplarda for loop ideal olarak kullanilabilir
        * Ancak tekrar sayisi belli olmayan baslangic veya bitis baska bir variable ye bagli olan durumlarda
        * for loop yerine while loop tercih edilir*/
       /* int s=10;
        while (s<100){
            // calisacak kod
            s++;
        }*/
        // 50 ile 100 arasindaki sayilari toplayin
        int toplam=0;
        for (int i = 50; i <=100 ; i++) {
            toplam+=i;


        }
        System.out.println("Toplam : " + toplam);
        // ayni soruyu while loop ile de yapalim
        // for loop da  3 seyi takip ederiz
        // 1-baslangic degeri
        // 2-bitis sarti
        //3-artis veya azalis sekli

        toplam=0;
        int sayi=50;

        while (sayi<=100){
            toplam+=sayi;
            sayi++;

        }
        System.out.println("While ile toplam : " + toplam  );
    }
}
