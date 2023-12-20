package day_45_murat;

public class TryCatchBlock2 {
    public static void main(String[] args) {
       String number="1";
       // String number="1a";// bu sekilde degistireli m// NumberFormatException----bu hatayi verdi
        try {
            int a=Integer.parseInt(number); // burada try ile string kontrol edilecek ve sonuc basilacak
            System.out.println(a);

           //String text=null; // birde string text null icin deniyoruz ve bu hatayi verdi(NullPointerException)
            String text="Java";
            System.out.println(text.length()); // yani degeri nul olan stringin lengt uzunlugunu cagiramayiz .asagida veya ile ekleriz

            int[] arr=new int[5];// burdaki hatayida asagiya veya ile ekledik
            arr[5]=3;

        }catch (NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException e){// basamazsa catch ile kod kesilmeden devasm edecek
            System.out.println(e.getMessage());// burda ise hata mesaji verecek

        }


    }
}
