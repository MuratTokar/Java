package extraCalismalarim8_13_Video_metot;

public class TerstenyazmaMetot {
   
    public static void main(String[] args) {
        System.out.println(terstenYaz("ali"));


    }

    public static String terstenYaz(String metin) {
        String tersMetin="";
        for (int i =metin.length()-1; i>=0; i--) {
           tersMetin+= metin.charAt(i);

        }
        return tersMetin;
    }

}

