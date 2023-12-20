package extraCalismalarim2;

import java.util.Scanner;

public class IfSoru {
    public static void main(String[] args) {
        // Kullanicidan notunu alin,50 veya daha büyükse "Sinifi gectin " 50 den kücükse "Maallesef kaldin yazsin"
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu girin");
        double not=scan.nextDouble();
        if (not>0 && not<50){
            System.out.println("Kaldin");
            // If statements de sart parantezinden sonra süslü parantez ({})  kullanmazsak java ilk  noktali virgule(;)
            // kadar olan kismi body olarak kabul eder.if body zaten bir satir ise bu bir sorun olamz ama if boyd
            // bir satirdan cok ise ilk satirdan sonrasi her durumda calisir

        } else if (not>=50&&not<=100) {
            System.out.println("Gectin");

        }else

        System.out.println("lütfen gecerli bir veri girin");
    }
}
