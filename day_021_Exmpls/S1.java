package day_021_Exmpls;

public class S1 {

    /*

    1. Verilen bir string i tersinden yazdiran program yaziniz. (karakterleri + ile veya concat()
method kullanarak birlestiriniz.)
Input : “I like Java” Output : “avaJ ekil I”

     */
    public static void main(String[] args) {

    String input="I like Java";


    String tersInput="";

        for (int i = 0; i < input.length(); i++) {

            tersInput+=input.charAt(input.length()-i-1);
        }
        System.out.println(tersInput);




    }



}
