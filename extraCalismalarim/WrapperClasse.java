package extraCalismalarim;

public class WrapperClasse {
    public static void main(String[] args) {
        // int -> Integer
        // byte -> Byte
        // short -> Short
        // long -> Long
        // char -> Character
        // boolean -> Boolean
        // float -> Float
        // double -> Double
    // non primitive data türlerinin hazir metotlari var ama prpmitive data türlerinin hazir metotlari yoktur
   //  java primitive data türleri icin kolayca gecis yapabilecekleri non primitive data türleri olusturmustur
Integer sayi=10;
// int variable atadigimiz degeri atayabiliyoruz ve hazir metotlari var
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);// -2147483648
        String str="345";
        System.out.println(str + 10);// 34510 toplamaz yanyana yazar.Ama bu durumda Wrapper classe ler devreye girer
          // parseInt=Integer objesini int e cevirir
        //VALUEOF=String degeri yada primitive(int9 i Integer Objesine cevirir
        //PARSE= integer objeyi primitive yani int e ceviririr
        int sonuc=Integer.parseInt(str);// String objeyi int e cevirdi
        System.out.println(sonuc);// String objeyi int e cevirdi
        System.out.println(Integer.parseInt("45458"));//String objeyi int e cevirdi
        sonuc=Integer.valueOf(sonuc);
        System.out.println(sonuc);//345
        char krk='3';
        System.out.println(Character.isDigit(krk));// icerdeki karakter bir sayi mi=True
        System.out.println(Character.isLetter(krk));// icerdeki karakter bir yazi mi=Fallse#
        // Primitive ile wrapper classe arasinda atama olur.ama int ile integer gibi
        String sayi1="1453";
        int sayi2=Integer.parseInt(sayi1);
        System.out.println(sayi2);
        // bu iki sayiyi kullanarak 2040 yazin.
            // bu iki integeri string yapmak icin "" hiclik yani tirnak kullanilarak ya a+""+b yada ""a+b
        int a4=20;
        int b4=40;
            System.out.println(a4 + "" + b4);
            System.out.println("" + a4 + b4);
            System.out.println("########################################");
            String y=String.valueOf(a4);
            String y1=String.valueOf(b4);
            System.out.println(y + y1);



    }


    }

