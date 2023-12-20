package extraCalismalarim4;

public class IndexOf {
    public static void main(String[] args) {
        String str = "Java cok ama cok güzel";
        System.out.println(str.indexOf("a"));//1
        System.out.println(str.indexOf("c"));//5
        System.out.println(str.indexOf("cok"));//5
        System.out.println(str.indexOf("cok", 6));// 13---6.index ten sonra cok kelimesinin indexini ariyor


        /// Verilen bir cumlede, istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin //
        // 1-aradiginiz kelime cumlede 1 kere kullanilmis
        // 2- aradiginiz kelime cumlede 2 kere kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        // 4-aradiginiz kelime hic kullanilmamis
        System.out.println(str.indexOf("java")); // aranan deger yok ve -1 döner
        String cumle = "Yasasin java,iyiki java ögreniyorum";
        String kelime = "java";
        if (cumle.indexOf(kelime) == (-1)) {
            System.out.println("aradiginiz kelime hic kullanilmamis");

        } else {
            int kelimeIlkIndex = cumle.indexOf(kelime);
            if (cumle.indexOf(kelime, (kelimeIlkIndex + 1)) == (-1)) {
                System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
            } else {
                int ikinciKelimeIndex = cumle.indexOf(kelime, (kelimeIlkIndex + 1));
                if (cumle.indexOf(kelime, (ikinciKelimeIndex + 1)) == (-1)) {

                    System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                } else {
                    System.out.println("Aradiginiz kelime 2 den fazla kullanilmis");

                }

            }
        }
    }
}