package extraCalismalarim7_12.video;

public class For3 {
    /*
    oru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin. Konsolda faktoryel
    hesabinin yapilisini da yazdirin. Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
     */
    public static void main(String[] args) {
        int sayi=8;
        int faktöryel=1;
        for (int i =sayi; i >=1; i--) {
            faktöryel*=i;




        }
        System.out.println(sayi + " ! = " + faktöryel);


    }
}
