package day_013_murat;

public class Task_42 {
    public static void main(String[] args) {
        // 1-100 arasindaki cift sayilarin toplamini / tek sayilarin toplamini yazdiran programi yaziniz

        int cifrSayiToplami=0;
        int tekSayiToplami=0;
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                // cifrSayiToplami= cifrSayiToplami+i;
                cifrSayiToplami+=i;
            }else {
                tekSayiToplami+=i;
            }

        }
        System.out.println(cifrSayiToplami);
        System.out.println(tekSayiToplami);

    }
}
