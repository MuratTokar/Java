package day_22_murat;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {


        //*************************************************************************
       /* for (int i = 0; i <str.length(); i++) {  // 2.yol

            System.out.println(str.charAt(i));
        }*/
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen  bir kelime girin: ");
        String metin= input.nextLine().toLowerCase();

       /* System.out.print("Lütfen  karakter girin: ");
       char c=input.next().charAt(0);
       int counter=0;
        for (int i = 0; i < metin.length(); i++) {
           // if (harf.charAt(i)=='a' || harf.charAt(i)=='e'|| harf.charAt(i)=='i'|| harf.charAt(i)=='o'|| harf.charAt(i)=='u');
            if (metin.charAt(i)==c) {
                // System.out.println(harf.charAt(i));
                counter++;
            }
        }
        System.out.println(metin + "icerisinde: " + counter + " tane " + c + " hafr var");*/
        int counter=0;
        String harfler="";
        for (int i = 0; i <metin.length(); i++) {
            if (metin.charAt(i)=='a'||metin.charAt(i)=='e'||metin.charAt(i)=='i'||metin.charAt(i)=='o'||metin.charAt(i)=='u'||metin.charAt(i)=='ü'){
              harfler+=(metin.charAt(i)+ ",");
              counter++;

            }


        }
        System.out.println(" Toplamda:  " + counter + " sesli harf vardir" );
        System.out.println("sesli harfler: " + harfler);

        //######################## concat##################################################4
        String str1="Basim agriyor";
        String str2="\tcünkü hastayim";
        String str3=str1.concat(str2);
        System.out.println(str3);

    }
}