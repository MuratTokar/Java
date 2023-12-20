package day_17_murat;

public class Task_65 {
    public static void main(String[] args) {
        /**
         * Girilen 3 notun(0-100) aritmetik ortalamasina göre
         * hangi harf e karsilik geldigini gösteren programi yaziniz
         * 90-100 -> A
         * 80-89 -> B
         * 70-79 -> C
         * 60-69 -> D
         * 0-59 -> F
         */
        calculateGrade(170,50,40);
    }
    public static void calculateGrade(int not1,int not2,int not3){
        int ortalama=(not1+not2+not3)/3;
        if (ortalama<=100 && ortalama>=0){
            if (ortalama>=90){
                System.out.println("Ortalama: " + ortalama + " A ");

            }else if (ortalama>=80){
                System.out.println("Ortalam: " + ortalama + " B ");
            }else if (ortalama>=70){
                System.out.println("Ortalama: " + ortalama + " C");
            }else if (ortalama>=60){
                System.out.println("Ortalam: " + ortalama + " D ");

            }else {
                System.out.println("Ortalama: " + ortalama + " F ");
            }

        }else {
            System.out.println("Lütfen gecerli bir not girin");
        }

    }
}
