package day_013_hakan;

public class Task_40 {
    public static void main(String[] args) {
        // 1-100 arasindaki cift sayilari yazdiran program
        // even : cift odd : tek
        int baslangic=2;
        int son=50;

        for(int i = baslangic; i < son; i++){
            if(i%2 == 0)
                System.out.print(i + ", ");
        }

        System.out.println("\n*********************************");
        for(int i = baslangic; i <son; i+=2){
            System.out.print(i);
            if(i < son-2){
                System.out.print(", ");
            }
        }
    }
}
