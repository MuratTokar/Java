package day_015_hakan;



public class BranchStatements {

    public static void main(String[] args) {

        // break, continue
        // break : Bulundugu döngü de aranan durum bulunduktan sonra, cikmak icin kullanilir
        // continue : Döngüden cikmadan, kendisinden sonraki kod blogunu pas gecmek icin kullanilir

        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
            }
            System.out.println("i'nin degeri : " + i); // continue dan sonra burayi pas gecer ve i yi arttirip, döngü ye devam eder
        }

        System.out.println("**************************************");

        for(int i=1; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println("i'nin degeri : " + i);
        } // break ten sonra buraya gelir, yani döngüden cikar

        System.out.println("**************************************");

        for(int i=1; i<=5; i++){
            System.out.println("1");
            break;
           // System.out.println("i'nin degeri : " + i);
        }

        System.out.println("**************************************");

        for(int i=1; i<=5; i++){
            System.out.println("1");
            continue;
            //System.out.println("i'nin degeri : " + i);
        }

        // !!! ÖNEMLI : break ve continue bir sart icerisinde kullanilir,
        // diger türlü kendisinden sonraki koda hic ulasilamayacagi icin hata verir


    }
}
