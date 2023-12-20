package day_18_murat;

public class Task_69 {
    public static void main(String[] args) {
        sayiAsalMi(5);
        System.out.println(sayiAsalMi(5));
        System.out.println(sayiAsalMi(7));
        System.out.println(sayiAsalMi(6));
        System.out.println(sayiAsalMi(11));
        System.out.println(sayiAsalMi(42));


    }

    public static boolean sayiAsalMi(int num) {
        if (num == 2) {
            return true;
        } else if (num > 2) {
            for (int i = 3; i < num; i++) {// 3'ten, kendisinden 1 eksige kadar sayilara tam bölünüp bölünmedigini kontrol ediyoruz
                if (num % i == 0) {// girilen sayinin tam böleni vaersa
                    return false;

                }
            }
        } else { // 0,1 ise false dön
            return false;
        }

        return true;

    }




}