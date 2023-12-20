package extraCalismalarim5;

public class Replace_ReplaceAll {
    public static void main(String[] args) {
        String str="Java candir";


        System.out.println(str.replace('J', 'H'));// J yerine H yazdircagiz

        System.out.println(str.replace("a", ""));// a larin yerine bosluk yani hiclik yazdi

        System.out.println(str.replace("Java", "X")); // java yerine X koydu

        System.out.println(str.replace("v", "yayaya"));

        System.out.println(str.replace(" ", ""));// bosluklari yok etti ve bitiisk yazdi

        System.out.println(str.replaceFirst("a", ""));
        String str1="mmnvkiuqtspü0ßw54597532lqw378uugzrdbhj45d4";
       str1= str1.replaceAll("\\d","");
        System.out.println(str1);

        System.out.println("******************************************");
       String str2="J&ava54 C+an01dir,,,"; // bunu java haline getirelim

       str2= str2.replaceAll("\\d","");// rakamlari sildik
        System.out.println(str2);
       str2= str2.replaceAll(" ","5");// bosluk yerine 5 atadik
        System.out.println(str2);
       str2= str2.replaceAll("\\W","");// harf ve rakam olmayan herseyi sildik
        System.out.println(str2);
       str2= str2.replaceAll("5"," ");// 5 yerine yine  bosluk olsuturduk
        System.out.println(str2);


        //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        // input1 : “15.30 €” , input2 : “11.40 €”output : 26.70 €

        String input="15.30 $";
        String input1="11.40 $";
        input=input.replaceAll("\\D","");// digit olmayanlari yok ettik ama halen string

        input1=input1.replaceAll("\\D","");// bunlari pars ile integere cevirecegiz.yani wrapper classa havale
       double inp=Double.parseDouble(input);// simdi int e cevirdik
       double inp1=Double.parseDouble(input1);
        System.out.println((inp1 + inp) / 100 + " $");


    }
}
