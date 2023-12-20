package day_013_murat;

public class RewiewIfelse {
    public static void main(String[] args) {
        // girilen sayinin 10 dan kücük olup olmadigini kontrol eden programi yaziniz.
        int x=5;
        if (x<=10){
            // a nin 10 dan kücük olma durumu
        }else {
            // a nin 10 dan buyuk olma durmu
        }



        for (int i = 1; i < 100; i *= 3) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }


        // 1-100 arasi cift sayilar
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(i + "-");

        }


        for (int i = 2; i < 100; i += 2) {
            System.out.println(i + ",");

        }

        for (int i = 1; i < 140; i += 2) {
            System.out.println(i);
        }
    }
}