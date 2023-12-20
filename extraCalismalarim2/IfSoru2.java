package extraCalismalarim2;

import java.util.Scanner;

public class IfSoru2 {
    public static void main(String[] args) {
        // Kullanicidan pozitif bir tam syai alin ve sayinin tek mi cifrt mi oldugunu yazdirin

        Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen pozitif bir sayi girin");
        double sayi=scan.nextDouble();

        if (sayi%2==0){
            System.out.println("girdiginiz sayi cifttir");
        } else if (sayi%2==1) {
            System.out.println("girdiginiz syai tektir");

        }else {
            System.out.println("lütfen gecerli bir sayi girn");

        }
    }
}
