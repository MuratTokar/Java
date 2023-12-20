package day_015_Exmpls;

import java.util.Scanner;

public class TLUI2f {

    /*

    Bir kullanici telefonunun pin sifresini unutuyor. En fazla 3 defa girme hakki oldugunu kabul
edersek, dogru girdiginde „Success“, yanlis girdiginde „Please try again!“, 3 defa yanlis
girdiginde „Phone locked!“ mesajlarini veren programi yaziniz.
final int PIN = 1234
1235 Please try again
1234 Success
final int PIN = 1234
1235 Please try again
1236 Please try again
1237 Phone locked!
     */


    public static void main(String[] args) {

    final int PIN=1234;

    int sayac=0;

    Scanner scan=new Scanner(System.in);
   // String scanner=scan.nextLine();

        while (sayac<3){
            System.out.println("Lutfen pininizi giriniz..");
            int input=scan.nextInt();



            if (input==PIN){
                System.out.println("Success ");break;
            } else {
                System.out.println("Please try again!");
                sayac++;
            }
        }

        if (sayac==3){
            System.out.println(" Phone locked!");

        }

        scan.close();


    }
}
