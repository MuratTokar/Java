package day_065_mrt;

public class C074 {
    void readCard(int cardNo) throws Exception{// gelen exception nu buraya : ( ex.readCard(cardNo); atacak
        System.out.println("Reading Card");
    }
    void checkCard(int cardNo) throws RuntimeException{// line n1
        System.out.println("Checking Card");

    }
    public static void main(String[] args) {
        C074 ex =new C074();
        int cardNo=12344;
      // ex.readCard(cardNo); // line n2
        ex.checkCard(cardNo);// line n3
        // Cevap C =compilation fails only at n2
    }
    /*
    * Exception;checked exceptionlari kapsadigi icin compile time error veriri
    * Exceptionu compile esnasinda handle etmemiz lazim
    * (IOException,SQLException,FileNotFoundException) en meshurlari bunlar
    *
    *
    * RunTimeException ise sadece unchecked exceptionlari yani runtime exxceptionlari kapsadigi icin
    * compile esnasinda handle etme zorunlulugu  yok*/


}

