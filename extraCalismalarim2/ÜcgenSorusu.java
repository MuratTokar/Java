package extraCalismalarim2;

import java.util.Scanner;
//Kullanicdan bir ucgenin 3 kenar uzunlugunu alin,ucgen es kenar ise "Eskenar ücgen " yazdirin

public class ÜcgenSorusu {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ücgenin 3 kenar uzunlugunu girin");

          double  kenar1=scan.nextDouble();
          double kenar2=scan.nextDouble();
          double kenar3=scan.nextDouble();
          if (kenar1==kenar2 && kenar1==kenar3){
              System.out.println("Girilen kenarlar bir es kenar ucgen olusturur");
          }


        

    }
}
