package homework10;

public class Homework6 {
    public static void main(String[] args) {
        /*Girilen karakterin harf mi, rakam mi, yoksa karakter mi oldugunu veren programi yaziniz.
      Input : q Output : „q“ bir harftir.
      Input : 1 Output : „1“ bir rakamdir.
      Input : @ Output : “@” bir karakterdir.

      char data type bir veriable
      Harf; a A,    Rakam;0,1,2...9, Karakter;+*#&...
      Buyuk Harf==> 65-90
      KucukHarf==>  97 - 122
      Rakamlar==> 48 -57
      Karakter==>

        */
        char input='2';
        int karakter=input;
        if (karakter> 65 && karakter < 90){System.out.println(input + " bir büyük harftir");}
        else if (karakter>=97 && karakter <= 122){System.out.println(input + " bir kücük harftir");}
        else if (karakter>=48 && karakter <= 57){System.out.println(input + " bir rakamdir");}
        else {System.out.println( input + " bir karakterdir");}





    }
}
