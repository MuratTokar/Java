package homework10;

public class Homework4 {
    public static void main(String[] args) {
        /*4--
         Verilen sayinin tek mi cift mi oldugunu veren programi yaziniz.
        Input : 17 Output : 17 tek bir sayidir.
        Input : 1002 Output : 1002 cift bir sayidir.

        */

                int  input=0;

                if (input%2==0){
                    System.out.println("sayi ciftir");
                }
                else if (input%2!=0){
                    System.out.println("sayi tektir");
                }

                  else if (input==0){
                      System.out.println("0 negatif yada pozitif bir sayi degildir");
                }


    }
}
