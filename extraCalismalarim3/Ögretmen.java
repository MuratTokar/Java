package extraCalismalarim3;

public class Ögretmen {
    String isim = "isim belirtilmedi";
    String soyisim ="soyisim belirtilmedi";
    String branch = "branch belirtilmedi";
    long tcNo = 0;
    static int sayac=0;
    static String Okul="Atatürk Ilk Okulu";

    public Ögretmen(String isim,String soyisim,String branch,long tcNo){
        // 1-Default constructor:java tarafindan olusturulur.Class tan obje olusturmak icin arka planda durur

        sayac++;
       this.isim=isim;
        this.soyisim=soyisim;
        this.branch=branch;
        this.tcNo=tcNo;
    }
    public void yazdir() {
        System.out.println("Adi : " + isim);
        System.out.println("Soyadi: " + soyisim);
        System.out.println("Bransi: " + branch);
        System.out.println("Tc.No: " + tcNo);
        System.out.println(Okul);
    }


    public static void main(String[] args) {
        // burada önce : ogretmen ogr1 objesi olusturduk
          // burada ise :=new ogretmen  constructor unu olusturduk ve bu sayede ögretmen objesine deger atariz
        Ögretmen ogr_1=new Ögretmen("Ali","Can","Matematik",12345678912l);
        Ögretmen ogr_2=new Ögretmen("Mehmet","Kök","Türkce",1456987326l);

        ogr_2.yazdir();
        ogr_1.yazdir();
        System.out.println(sayac);


    }
}