package extraCalismalarim8_13_Video_metot;

public class Faktöryel {
    public static void main(String[] args) {
      //  Method2.sayilariTopla(); // Method2 deki metodu class ismi ile cagirip burda islem yaptim

        // verdigimiz bir sayinin faktoryelini hesaplayyip sonucu bize döndüren metoto yazin

        
       int sonuc= faktöryelHesapla(5);// burayada metoda gonderilecek sayi yazilir.eger yazdiracaksak sonucu bir variableye atariz
        System.out.println("Faktöryel 5! : " + sonuc);

    }

   public static int faktöryelHesapla(int sayi) {// method agönderecegimiz bilgileri hangi variable ile göndereceksek paranteze yazariz


        int faktöryel=1;// carpma olacagi icin sifir yazamayiz ,cunku yok ederdi
       for (int i = 5; i >=1; i--) {
           faktöryel*=i;

       }

       return faktöryel;
   }
}
