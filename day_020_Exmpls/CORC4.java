package day_020_Exmpls;

import java.util.Random;

public class CORC4 {

/*
Rastgele email adresi olusturan bir method yaziniz.
createEmail(6,”gmail”) -> test_xxxxxx@gmail.com x : rastgele bir karakter olmali
createEmail(1,”gmail”) -> test_x@gmail.com
createEmail(10,”gmail”) -> test_xxxxxxxxxx@gmail.com
 */


    public static void main(String[] args) {

        Random random=new Random();
        int nameLength=random.nextInt(10)+1;

        createEmail(nameLength,"gmail");

    }
    public static void createEmail(int i, String gmail) {


        int nameLength=i;

        Random random=new Random();
        //  karakter random olusturulacak...
        String karakter="#";

        for (int j = 0; j <=nameLength; j++) {

            System.out.print(karakter);
        }
        System.out.print("@" + gmail+".com");

    }

}
