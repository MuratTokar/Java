package day_063_hakan;

public class Q42 {
    /**
     * 42. Which statement will empty the contents of a StringBuilder
     *          variable named sb?
     * A. sb. deleteAll ();
     * B. sb. delete (0, sb. size () );
     * C. sb. delete (0, sb. length () );
     * D. sb. removeAll ();
     */

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.deleteCharAt(1);
        System.out.println(sb); // jva
        sb.delete(2,3); // delete (startIndex, endIndex) startIndex(included), endIndex(not included)
        System.out.println(sb); // jv

        StringBuilder sb1 = new StringBuilder("Java benim herseyim");

        sb1.delete(5,10); // "Java (benim) herseyim"
        System.out.println(sb1);// "Java  herseyim"
    }
}
