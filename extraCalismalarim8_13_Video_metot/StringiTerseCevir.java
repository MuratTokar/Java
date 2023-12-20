package extraCalismalarim8_13_Video_metot;

public class StringiTerseCevir {
    public static void main(String[] args) {
        System.out.println(stringiTerseCevir("Murat"));
        System.out.println(stringiTerseCevir("Hava cok güzel"));


    }
    public static String stringiTerseCevir(String metin){
        String tersMetin="";
        for (int i =metin.length()-1; i >=0; i--) {
            tersMetin+=metin.charAt(i);

            System.out.print(metin.substring(i, i +1)); //eger sonuc donmeyecekse

        }

        return tersMetin;
    }
}
