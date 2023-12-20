package day_009_hakan;

public class Task_20 {

    public static void main(String[] args) {
        int a = 1;
        a = -a-- + a++ / -a-- * --a ; // -1 (a = 0) + 0 (a = 1) / -1 (a = 0) * -1 (a = -1)
        // -1 + 0 / -1 * -1
        // -1 + 0 = -1

        // increment ve decrement islemleri varsa islem önceligi bu operator lardadir. Soldan saga dogru isleme alinir
        System.out.println(a);
    }
}
