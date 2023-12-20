package day_018_Exmpls;

import java.util.Scanner;

public class M4 {
     /*
    4. Kullanicin girdigi sayiyi control edip,
0’dan büyük ise pozitif
0’dan kücük ise negative
0’a esit ise sifir
ciktisini veren bir method yaziniz.
Input : 10 Output : Pozitif
Input : -5 Output : Negatif
Input : 0 Output : Sifir
     */


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz..");

        int sayi=scanner.nextInt();

        control(sayi);

    }

    public static void control(int sayi) {
        if (sayi==0){
            System.out.println("Sifirdir");
        } else if (sayi>0){
            System.out.println("Pozitiftir");
        } else{
            System.out.println("Negatiftir");
        }
    }
}
