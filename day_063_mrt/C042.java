package day_063_mrt;

public class C042 {
    public static void main(String[] args) {
        /**
         * 42. Which statement will empty the contents of a StringBuilder
         *          variable named sb?
         * A. sb. deleteAll ();
         * B. sb. delete (0, sb. size () );
         * C. sb. delete (0, sb. length () );// cevap C ...0 . index ten baslar sb nin uzunlugu kadar yani tamamne siler
         * D. sb. removeAll ();
         */
        StringBuilder sb = new StringBuilder("Java");
        sb.deleteCharAt(1);// 1.index teki a yi siler
        sb.delete(2,3);//  baslangic ve bitis index i arasini siler .Bitis dahil degil


    }
}