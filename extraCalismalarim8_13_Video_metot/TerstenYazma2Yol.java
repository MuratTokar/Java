package extraCalismalarim8_13_Video_metot;

public class TerstenYazma2Yol {
    public static void main(String[] args) {
        String tersten="Murat";

        for (int i =tersten.length()-1; i >=0; i--) {
            System.out.print(tersten.substring(i,i+1)); // 1.yol
            // System.out.print(tersten.charAt(i));// 2.yol
        }
    }
}
