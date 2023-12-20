package extraCalismalarim2;

import java.util.Scanner;

public class Ternary_If_Soru {
    public static void main(String[] args) {


        // kullanicidan bir tam sayi alip mutlak degerine cevirip yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayi girin");
        int tamsayi=scan.nextInt();
        if (tamsayi>=0){
            System.out.println(tamsayi);
        }else {
            System.out.println(tamsayi * (-1));

       }
        System.out.println(tamsayi >= 0 ? tamsayi : tamsayi * (-1));// 2.yol ternary ile
    }
}
