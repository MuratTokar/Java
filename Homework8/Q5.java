package Homework8;

public class Q5 {
    public static void main(String[] args) {
         /*
    Bir restoranda hesap, KDV haric gelmektedir. KDV orani %18 olduguna göre, gelen hesabin,
KDV dahil halini veren programi yaziniz.
input = 100€ output = 118€
     */



            int input=100;
            int hesap;
            int Kdv=input*18/100;
            hesap=input+Kdv;

            System.out.println("KDV dahil hesap: "+ hesap);
    }
}
