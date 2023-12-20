package extracalismalarim6_11.video;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
    //   Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        //   Erkek 65 yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya

     // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi girin");
        String cinsiyet=scan.next();
        System.out.println("Lütfen yasinizi girin");
        int yas=scan.nextInt();

        if (cinsiyet=="Kadin"){
            if (yas>=60){
                System.out.println("Emekli olabilirsiniz");
            }else {
                System.out.println("Emekli olabilmeniz icin " +(60-yas)+ "yil daha calismalisiniz");
            }
        }else{
            if (cinsiyet=="Erkek"){

            } else if (yas>=65) {
                System.out.println("Emekli olabilirsiniz");

            }else {
                System.out.println("Emekli olabilmeniz icin " +(65-yas) + "yil daha calismalisiniz");
            }
        }

    }
}
