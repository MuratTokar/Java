package Homework13;

public class Cozum_8 {
    public static void main(String[] args) {
          /*

    8. 1’den verilen sayiya kadar olan sayilarin küplerinin toplamini veren programi yaziniz.
Input : 3 Output : 36

1^3 + 2^3 + 3^3=
     */




            int input=5;
            int sayilarinKupu=0;

            for (int i = 1; i <=input ; i++) {
                sayilarinKupu+=i*i*i;

            }
            System.out.println(sayilarinKupu);
    }
}
