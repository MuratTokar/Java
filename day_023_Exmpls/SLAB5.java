package day_023_Exmpls;

public class SLAB5 {

    /*
    5. Verilen bir cümlenin ilk kelimelerinin bas harflerini büyük harf yapan program yaziniz.
Input : “Basari seni bulmaz, sen cikip onu yakalamalisin.”
Output : “Basari Seni Bulmaz, Sen Cikip Onu Yakalamalisin.”
     */


    public static void main(String[] args) {

    String input="Basari seni bulmaz, sen cikip onu yakalamalisin.";

    int spaceIndex=input.indexOf(" ");

    String ilkKelime=input.substring(0, spaceIndex);

    String kalanCumle=input.substring(spaceIndex);

    String buyukHarfeCevir= ilkKelime.substring(0,1).toUpperCase() + ilkKelime.substring(1);

    String output=buyukHarfeCevir;

    spaceIndex=kalanCumle.indexOf(" ");



        while (spaceIndex>=0){
        String sonrakiKelime=kalanCumle.substring(0, spaceIndex+1);
        output+=sonrakiKelime.substring(0,1).toUpperCase()+ sonrakiKelime.substring(1);
        kalanCumle=kalanCumle.substring(spaceIndex+1);
        spaceIndex=kalanCumle.indexOf(" ");
    }
        output+=kalanCumle.substring(0,1).toUpperCase()+kalanCumle.substring(1);

        System.out.println(output);

    //   2. yoll ==> once inputtaki tum spacelerin indexleri alinir

        int ilkSpaceIndex=input.indexOf(" ");
        int ikinciSpaceIndex= input.indexOf(" ", ilkSpaceIndex+1);
        int ucuncuSpaceIndex= input.indexOf(" ", ikinciSpaceIndex+1);
        int dorduncuSpaceIndex=input.indexOf(" ", ucuncuSpaceIndex+1);
        int besinciSpaceIndex=input.indexOf(" ", dorduncuSpaceIndex+1);
        int altinciSpaceIndex=input.indexOf(" ", besinciSpaceIndex+1);

        String ilkBolum=input.substring(0, ilkSpaceIndex);
        String ikinciBolum=input.substring(ilkSpaceIndex+1, ikinciSpaceIndex);
        ikinciBolum=ikinciBolum.substring(0,1).toUpperCase()+ikinciBolum.substring(1);
        String ucuncuBolum= input.substring(ikinciSpaceIndex+1, ucuncuSpaceIndex);
        ucuncuBolum=ucuncuBolum.substring(0,1).toUpperCase() + ucuncuBolum.substring(1);
        String dorduncuBolum=input.substring(ucuncuSpaceIndex+1, dorduncuSpaceIndex);
        dorduncuBolum=dorduncuBolum.substring(0,1).toUpperCase() + dorduncuBolum.substring(1);
        String besinciBolum= input.substring(dorduncuSpaceIndex+1, besinciSpaceIndex);
        besinciBolum=besinciBolum.substring(0,1).toUpperCase() + besinciBolum.substring(1);
        String altinciBolum=input.substring(besinciSpaceIndex+1, altinciSpaceIndex);
        altinciBolum=altinciBolum.substring(0,1).toUpperCase() + altinciBolum.substring(1);
        String sonKelime=input.substring(altinciSpaceIndex).substring(0,2).toUpperCase() + input.substring(altinciSpaceIndex).substring(2);


        String istenenHaldeCumle=ilkBolum.concat(" ").concat(ikinciBolum.concat(" ")).concat(ucuncuBolum.concat(" ")).concat(dorduncuBolum.concat(" ")).concat(besinciBolum.concat(" ")).concat(altinciBolum).concat(sonKelime);
        System.out.println(istenenHaldeCumle);







    }
}
