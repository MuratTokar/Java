package day_018_Exmpls;

public class M11 {

    /*
2 lik sayi sistemini 3 lük sayi sistemine ceviren program yaziniz.
- 2 lik sistemden 10 luk sisteme dönüstüren bir method
- 10 luk sistemden 3 lük sisteme ceviren bir method
Input : 1011 Output : 102
     */

    public static void main(String[] args) {
        
        onlugaCevir("1011");

    }

    public static void onlugaCevir(String s) {
         int onlukDegeri=0;
         int ikininKati=1;

        for (int i = s.length()-1 ; i >=0 ; i--) {
            onlukDegeri+=i*ikininKati;
            ikininKati*=2;
        }
        // System.out.println(onlukDegeri);  // onluk isteme cevirdim ve test ettim.

        uclugeCevir(onlukDegeri);
    }

    public static void uclugeCevir(int onlukDegeri) {

        String uclukHali="";

        while (onlukDegeri>0){

            int kalan=onlukDegeri%3;

            uclukHali=kalan+uclukHali;

            onlukDegeri/=3;
        }
        System.out.println(uclukHali);


    }

}
