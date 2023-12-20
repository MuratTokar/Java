package day_32_murat;

public class Printer {

      /*  TASK
      class printer
      fields:tonerLevel,printedPageNumberA4
      methods:fillUpToner()// max 100%
      printPage()// incresae the page number
       */
        private int tonerLevel=100;// toner seviyesi
        private int printedPageNumber;// yazdirilacak sayafa sayisi
        private double tonerConsumptionPerPage;// sayfa basina toner tüketimi

    public Printer(double tonerConsumptionPerPage){ //constructor metot
        this.tonerConsumptionPerPage=tonerConsumptionPerPage;


    }
    public int getTonerLevel(){ // böylece disardan okunacak
        return this.tonerLevel;

    }
    public int getPrintedPageNumber(){
        return this.printedPageNumber;
    }
    public void fillUpToner(int rate){ // azalan toneri artiracak
       if(100== this.tonerLevel){
           System.out.println("Toner zaten dolu..");
           System.out.println("%" + rate + "yedekte tutuluyor");
       }
       this.tonerLevel+=rate;
       if (100<this.tonerLevel){
           int filledAmount=rate-(this.tonerLevel-100);
           int overloadAmount=rate-filledAmount;
           System.out.println("%" + filledAmount + "dolduruldu");
           System.out.println("%" + overloadAmount + "yedekte tutuluyor");
           this.tonerLevel=100;
       }
    }
    public void printPage(int pagenumber){
        System.out.println("Sayfa yazdiriliyor..");
        System.out.println("Yazdirilan syafa sayisi : " + 1);
        this.printedPageNumber+=pagenumber;
        updateTonerLevel(pagenumber);
    }
    public void printPage() {
        System.out.println("Sayfa yazdiriliyor..");
        this.printedPageNumber++;


    }


    public void setTonerConsumptionPerPage(double tonerConsumptionPerPage) {
        this.tonerConsumptionPerPage = tonerConsumptionPerPage;
    }

    private   void updateTonerLevel(int pageNumber){
        this.tonerLevel-=(int)this.tonerConsumptionPerPage*pageNumber;


    }

}
