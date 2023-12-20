package extraCalismalarim;

public class DataCasting {
    public static void main(String[] args) {


        // Java da bir data türündrki data yi baska bir data turune cevirmeye data casting denir.
        // Her data türü birbirine cevrilmez
        //
       // Ancak zorlayarak esitleyebiliriz ama data kaybi yasanir.önce onayimizi alirlar ve atadigimiz datanin
        // yanina cevirmek istedigimiz variablenin ismini yazariz
        double db=124.44445;
        System.out.println(db);

        short st=(short) db;//
        System.out.println(st);

        // Benzer data türündeki variable ve degerler arasinda casting yapmak istedigimizde ,
        // daha kapsamli data türündeki variable ,daha düsük kapsamli data türünden deger atamasi yaparaak JAVA AUTO WIDENING yapar
    double db1=45.32;
    int in1=(int)db1;// normalde büyük kova kucuge bosaltilmaz.Ama zorla olur.atanan degerin yanina karsidaki data türü
    // paranteze yazilir
        System.out.println(in1);// 45 verdi ve küsürat gitti
   in1=34;

        db1=3987876765d;
        in1=(int)db1;
        System.out.println(db1);

        




}
}