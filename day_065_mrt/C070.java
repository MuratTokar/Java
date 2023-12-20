package day_065_mrt;

public class C070 {
    public static void main(String[] args) {
        int x=10;  //x=10
        int y=++x; //y=11
        int z=0; // z:12
        if (y >= 10 | y <= ++x) {// x=12
            // I tek oldugu icin java hem saga hemde sola bakacak
       // if (y >= 10 || y <= ++x) { ama böyle cift olsaydi java sadece ilkine bakacak eger true ise ikinciye bakmayacak
            // ve ++x in degerini arttirmayacaktik ,görmeyecektik
            z=x;
        }else {
            z=x++;
        }
        System.out.println(z);
    }
}// Cevap= C--12
