package extraCalismalarim;

public class Relational_Karsilastirma_Op {
    public static void main(String[] args) {
        // esitlik(Cift esitlik isareti):==
        // Javada matematikten farkli olarak = isareti assignment(atama islemi yapapr,esitligi kontrol etmez)
        // javada iki degerin esit olup olmadigini kontrol etmek icin == isareti kullanilir ve sonuc olarak bize
        // true yada false doner
        int a=10;
        int b=15;
        System.out.println(a == b);// f
        System.out.println(a == b - 5);// t
        boolean c;
        System.out.println(c = 15 == b);//t
        System.out.println(c = 15 * a == 10 * b);//t
        System.out.println(c);
        System.out.println("################   != eit degil     #######################################");
        // Esit Degil= != unlem hangi islemin basin agelirse tersini yapar
        System.out.println(a != b);
        System.out.println(a != b - 5);
        System.out.println(c = 15 != b);
        System.out.println("####################  &&  ve ");
        /*
        && operatöru bielestirdigi  2 boolean ifadenin ikiside dogru ise tru olur.Bunu disindakilerin hepsi falls
         */
        System.out.println("##################  ||  veya #####################################");
        // Hepsi fall olursa sonuc falls olur diger durumlarda True
    }
}
