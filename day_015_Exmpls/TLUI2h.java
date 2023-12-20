package day_015_Exmpls;

public class TLUI2h {

    /*
    Kullanici tarafindan girilen 2 sayinin en büyük ortak bölenini (EBOB) ve en kücük ortak katini
    (EKOK) yazdiran program yaziniz.

    Input : 20, 45 Output : EBOB(20,45) = 5, EKOK(20,45) = 180


     */
    public static void main(String[] args) {


        int num1=20;
        int num2=45;

        int ebob= ebobBul(num1,num2);
        int ekok=ekokBul(num1, num2, ebob);

        System.out.println("Ebob ; " + ebob);
        System.out.println("Ekok ; " +ekok);
    }

    private static int ekokBul(int num1, int num2, int ebob) {
        return num1*num2/ebob;
    }

    public static int  ebobBul(int num1, int num2) {
        return num1>num2 ? num1%num2 : num2%num1;
    }


}