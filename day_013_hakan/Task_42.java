package day_013_hakan;

public class Task_42 {
    public static void main(String[] args) {
        // 1-100 arasindaki cift sayilarin toplamini / tek sayilarin toplamini yazdiran programi yaziniz

        int baslangic = 1;
        int son = 100;
        int toplamTek = 0;
        int toplamCift = 0;

        for(int i = baslangic; i < son ; i++ ){
            if(i%2 == 0){
               // toplamCift = toplamCift + i;
               toplamCift += i;
            } else {
                // toplamTek = toplamTek + i;
                toplamTek += i;
            }
        }

        System.out.println("Cift sayilarin toplami : " + toplamCift);
        System.out.println("Tek sayilarin toplami : " + toplamTek);
    }
}
