package day_020_Exmpls;

import java.util.Random;

public class CORC2 {

/*
Bir ögrenci class I olusturun.
- fields : name, studentNo, age, originCity, school
- methods : getInfo() ögrenciye ait bütün degerleri konsola yazdirmali
4 adet ögrenci object i olusturun ve bu ögrencilerin bilgilerini rastgele olusturup,
atayan program yaziniz.
name : sirasi ile sesli ve sessiz harflerden olusmali, en az 3, en fazla 10 karakter olmali
studentNo : 7 haneli bir sayi olmali, icerisinde 0 olabilmeli ama 0 ile baslamamali
age : 7 ile 77 arasinda olmali
- 7 - 11 araliginda ise -> school : ilkokul
- 12 - 15 araliginda ise -> school : ortaokul
- 16 - 19 araliginda ise -> school : lise
- 20 - 30 araliginda ise -> school : universite
- 30 - 77 araliginda ise -> school : Guidersoft
originCity : Sectiginiz 4 farkli sehirden birini atayin, fakat ögrenciler farkli sehirlerden
olmali, yani 2 ögrenciye ayni sehir atanmamali.
 */

public String isimOlustur(){

    Random random=new Random();

    StringBuilder sbIsim=new StringBuilder();

    String sesliHarfler="aeiuo";
    String sessizHarfler="bcdfghjklmnprstwxyz";

    int isminLength=random.nextInt(8)+3;

    //  b    u    h    i      m        o

    for (int i = 0; i < isminLength; i++) {

        if (i%2==0){
            sbIsim.append(sessizHarfler.charAt(random.nextInt(sessizHarfler.length())));
        } else {
            sbIsim.append(sesliHarfler.charAt(random.nextInt(sesliHarfler.length())));
        }
    }

return sbIsim.toString();

}


public String numaraOlustur(){

Random random=new Random();

StringBuilder sbNumara=new StringBuilder();

    for (int i = 0; i <7 ; i++) {
        sbNumara.append(random.nextInt(7));

    }

return sbNumara.toString();

}

/*
7 - 11 araliginda ise -> school : ilkokul
- 12 - 15 araliginda ise -> school : ortaokul
- 16 - 19 araliginda ise -> school : lise
- 20 - 30 araliginda ise -> school : universite
- 30 - 77 araliginda ise -> school : Guidersoft
 */
public String yasBul(){

    Random random=new Random();
    // 7  77
     int yas=random.nextInt(71)+7;
    System.out.println("Yas : "+yas);
     String okul;

     if (yas<12){
         okul="ilkokul";
     } else if (yas>=12 && yas<16){
         okul="Orta okul";
     }else if (yas>=16 && yas<19){
         okul="Lise";
     }else if (yas>=19 && yas<30){
         okul="Universite";
     } else {
         okul="Guidersoft";
     }

    return okul;
}

public String memleketi(){
    Random random=new Random();

    int memleketNumarasi=random.nextInt(4)+1;
    String memleket="";

    switch (memleketNumarasi){
        case 1: memleket="Trabzon";break;
        case 2: memleket="Frankfurt";break;
        case 3: memleket="Bonn";break;
        case 4: memleket="Paris";break;
    }

    return memleket;
}


}
