package extraCalismalarim;

import java.util.Scanner;

public class SoruCevap_002 {
    public static void main(String[] args) {
          /*
             Kullanicinin ismini ,soyismini ve yasini alip asagidaki formatta yazdirin.
             girilen bilgiler= J  Doe,44
              */
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi ,soyisminizi ve yasinizi giriniz "+
               "\nHer bilgiden sonra ENTER e basin" );
        char isminIlkHarfi=scan.nextLine().charAt(0);
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();
        System.out.println("Girilen bilgiler: " +isminIlkHarfi+" "+soyisim+", "+yas);
    }

}
