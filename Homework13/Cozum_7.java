package Homework13;

public class Cozum_7 {
    public static void main(String[] args) {
        //1‘den verilen sayiya kadar olan sayilarin karesini yazdiran programi yaziniz.
        //Input : 4 Output : 1^2 = 1
        //2^2 = 4
        //3^2 = 9
        //4^2 = 16
        //5^2 = 25
        int input=8;

        for (int i = 1; i <=input; i++) {
            int sayilarinKaresi= i*i;
            System.out.println(i+ "^2 = " + sayilarinKaresi);
        }

    }
}
