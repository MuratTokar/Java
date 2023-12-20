package day_013_hakan;

public class Task_41 {
    public static void main(String[] args) {
        // 5-140 arasindaki tüm tek sayilari yazdiran program
        int baslangic = 6;
        int son = 141;
        for(int counter = baslangic; counter <= son ; counter++){
            if(counter%2 == 1){
                System.out.print(counter );
                if(counter < son -1 ){
                    System.out.print(", ");
                }
            }
        }
    }
}
