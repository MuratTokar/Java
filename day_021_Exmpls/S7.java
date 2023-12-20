package day_021_Exmpls;

public class S7 {
    /*

    7. Girilen bir string icerisinde harflerden baska karakter olup olmadigini kontrol eden
program yaziniz.
Input : “Good4Bye“ Output : Harf harici karakterler var : “4“
Input : “Merhaba“ Output : Sadece harflerden olusmaktadir.
     */

    public static void main(String[] args) {


    String input="Good4Bye";

    String cuvalHarf="";
    String cuvalKarakter="";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)>=65 && input.charAt(i)<=90  || input.charAt(i)>=97 && input.charAt(i)<=122){
                cuvalHarf+=input.charAt(i);
            } else {
                cuvalKarakter+=input.charAt(i);
            }
        }

        System.out.println(cuvalHarf);
        System.out.println(cuvalKarakter);






    }
}
