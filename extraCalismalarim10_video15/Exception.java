package extraCalismalarim10_video15;

public class Exception {
    // javada exception olustugunda yapilacak islem belirtilmisse ,java kodun calismasini devam ettirir buna Handling
    // exception denir.ongordugumuz hatalar oluisursa yani.
    //belirtilmemisse exception yayinlar ve kodun calismasini durdurur
    // try-catch ile kontrol edilir


    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            System.out.println(a/b);      // risk olusmasini bekledigimiz kodlar buraya yazilir
        } catch (ArithmeticException e){  // bu alan ortaya cikmasi beklenen exception olustugunda store edecegimiz
                                         // exception objesi.karsilasilan exception bu e objesinin icine konulur
            e.printStackTrace();         // beklenen exception olustugunda yapilacak islem veya rapolama turunun kodu.ya islem ya rapor vs.

                                          // chatch bolgu ise beklenen exception lar olustugunda yapilacak islemi belirttigimiz bolum


            // OBJECT--> THROWABLE----1-Error-----2-Exception->>>>>A2:Checked Exception     B2:Unchecked  exceptions
            // CHECKED EXCEPTION= Kod yazarken alti kirmizi cizilen hatalardir

            //                    1:ClassNotFoundexception
             //                   2: InterruptedException
            //                    3: IOException
            //                    4:InstantiationException
            //                    5:SQLException
            //                    5:FileNotFoundException// bir dosya okumak istedigi,izde bulamadigimiz exception-parent IOexception

            //     UNCHECKED EXCEPTION=Kod run edildikten sonra karsimiza cikan exception lardir.Yanu RunTime Exception

            //                   1:AritmeticException
            //                    2:ClassCastException
            //                    3:NullPointerException
            //                    4:ArrayIndexOutOfBoundsException
            //                    5:ArrayStoreException
            //                    6:IllegalThreadStateException



        }


    }
}