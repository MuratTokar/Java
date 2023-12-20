package day_017_hakan;

public class Task_65 {
    /**
     * Girilen 3 notun(0-100) aritmetik ortalamasina göre
     * hangi harf e karsilik geldigini gösteren programi yaziniz
     * 90-100 -> A
     * 80-89 -> B
     * 70-79 -> C
     * 60-69 -> D
     * 0-59 -> F
     */

    public static void main(String[] args) {
        calculateGrade(80, 70, 20);
    }

    public static void calculateGrade(int note1, int note2, int note3){
        int ortalama = (note1 + note2 + note3)/ 3;
        if(ortalama <= 100 && ortalama >= 0){
            if(90 <= ortalama){
                System.out.println("Ortalama " + ortalama + " : A");
            } else if(80 <= ortalama){
                System.out.println("Ortalama " + ortalama + " : B");
            } else if(70 <= ortalama){
                System.out.println("Ortalama " + ortalama + " : C");
            } else if(60 <= ortalama){
                System.out.println("Ortalama " + ortalama + " : D");
            } else {
                System.out.println("Ortalama " + ortalama + " : F");
            }
        } else {
            System.out.println("Lütfen gecerli notlar giriniz!");
        }
    }
}
