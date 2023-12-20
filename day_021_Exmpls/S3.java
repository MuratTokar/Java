package day_021_Exmpls;

public class S3 {
    /*

     3. Verilen cümlede harfler haricindeki karakterleri silip, yerine bosluk(“X“) koyan
programi yaziniz.
Input  : “Benim adim `Tatar Ramazan`! Ben bu oyunu bozsam mi, bozmasam mi?“
Output : “Benim adim XTatar RamazanXX Ben bu oyunu bozsam miX bozmasam miX“
     */
    public static void main(String[] args) {


    String input="Benim adim `Tatar Ramazan`! Ben bu oyunu bozsam mi, bozmasam mi?";
        System.out.println(input);

    //   1 . yol

        input=input.replace("`", "X").replace("," , "X").replace("!", "X").replace("?", "X");
        System.out.println(input);


    //  2 . yol

        input=input.replaceAll("\\p{Punct}", "X");
        System.out.println(input);

    }
}
