package extraCalismalarim;

import java.util.Scanner;

public class SoruCevap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adinizi girniz");
        String ad = scan.next();
        System.out.println("Lütfen soyadinizi girin");
        String soyad = scan.next();
        System.out.println("Lütfen yasinizi girin");
        int yas = scan.nextInt();


        System.out.print("Adiniz: " + ad + "\n" + "Soyadiniz:" + soyad + " \n " + "Yasiniz:" + yas + "\n");
           /* System.out.println("Soyadiniz: " + soyad);
            System.out.println("Yasiniz : " + yas);*/
        System.out.println("Kaydiniz basari ile tamamlanmitir");




    }
}