package day_065_hakan;

import java.io.IOException;

public class Q74 {
}

class Test2 {
    void readCard (int cardNo) throws IOException {
        System.out.println("Reading Card");
    }

    void checkCard(int cardNo) throws RuntimeException { // line n1
        System.out.println("Checking Card");
    }

    public static void main(String[] args) {
        Test2 ex = new Test2();
        int cardNo = 12344;
        // ex.readCard(cardNo);   // line n2
        ex.checkCard(cardNo);    // line n3
    }
}

// Hint :

/**
 * Exception, checked exception lari kapsadigi icin compile time error verir.
 * Exception i compile esnasinda handle etmemiz gerekir.
 * (IOException, SQLException, FileNotFoundException)
 *
 * RunTimEException ise sadece unchecked exceptionlari,
 * yani runtime exceptionlari kapsadigi icin compile esnasinda handle etme
 * zorunlulugu yoktur.
 */