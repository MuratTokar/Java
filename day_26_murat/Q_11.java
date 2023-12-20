package day_26_murat;

import java.util.Arrays;

public class Q_11 {
    public static void main(String[] args) {

/**
 *  Bir array in icerisinde 2 sayisi varsa ve hemen arkasindan 3 sayisi geliyorsa
 *  3 sayisinin yerine 0 degerini yazan ve sonucu array olarak bastiran program
 */



        //int[] nums={1,2,3}; // 2.sirada Array lari yaz
        //int[] nums={2,3,5};
        //int[] nums={1,2,1};
        int[] nums={11,2,13,3,2,3};
        System.out.println(Arrays.toString(nums));// orijinal array
        setThreeToZeroWhen(nums);// 3.metot ismini cagirdik
        System.out.println(Arrays.toString(nums));// 8: toString ile stringe cevirdim ve baastim.Sonuc -1 cikti ve yanlis

    }
    public static void setThreeToZeroWhen(int[] numbers){   //1.metot

      /* 2 yi ara eger bulduyasan arkasinda 3  ara
      3 ü bulduysan degerini 0 yap
      */

        //2.Yol for döngüsü

        for (int i = 0; i <numbers.length; i++) {
            if (numbers[i]==2){ // yada 2.if kullanmadan numbers[i]==2 && numbers[i+1]==3
                if (numbers[i+1]==3){
                    numbers[i+1]=0;

                }

            }

        }



       /*iceride birden fazla key ,yani aranan deger ,binarySearch metodo aranan key yokmus gibi sonuc döner
        int indexOf2=Arrays.binarySearch(numbers,2); //4: sayi ikiyi ariyroum ve indexOf2 adinada yeni degiskene atiyorum
        System.out.println(indexOf2);
        if (0<=indexOf2){ // 5:indexOf sifirdan büyükse iceri gir
            if (numbers[indexOf2+1]==3){ // 6:numbers ten indekxof2 ye gidiyorum ve 1 ekliyorum ,3 ü bulmak icin
                numbers[indexOf2+1]=0; // 7:eger 3 ise 0 degeri ata
            }
            }*/
        }
    }
