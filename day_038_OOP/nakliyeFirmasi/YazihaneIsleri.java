package day_038_OOP.nakliyeFirmasi;

import java.util.ArrayList;
import java.util.List;

public class YazihaneIsleri {

   private List<Esya> esyaListesi;





   public YazihaneIsleri(){
       esyaListesi=new ArrayList<>();
   }




   public void esyaEkle(Esya esya){
       esyaListesi.add(esya);
   }




   public void esyaListesiYazdir(){

       for (Esya each: esyaListesi) {


           System.out.println("Isim : "  +each.getIsim());
           System.out.println("Renk : "  +each.getRenk());
           System.out.println("Miktar : "  +each.getMiktar());
           System.out.println("Hacim : "  +each.getHacim());
           System.out.println("----------------------------");


       }
   }


   public double hacimHesapla(){
       
       double toplamHacim=0.0;

       for (Esya each: esyaListesi) {
           toplamHacim+=each.getHacim()*each.getMiktar();
       }
       return toplamHacim;
   }

   public double teklifGonder(){


       double toplamHacim=hacimHesapla();
       double fiyat;

       if (toplamHacim<=10){
           fiyat=toplamHacim*90;
       } else if (toplamHacim<=20){
           fiyat=toplamHacim*80;
       } else {
           fiyat=toplamHacim*70;
       }

       return fiyat;
   }






}
