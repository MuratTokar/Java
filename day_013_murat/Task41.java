package day_013_murat;

public class Task41 {
    public static void main(String[] args) {
       /* for (int i = 5; i < 140; i += 2) {
            System.out.print(i+",");
        } */
        int baslangic=5;
        int son=140;
        for (int counter =baslangic; counter<=son; counter++){
            if (counter%2==1){
                System.out.print(counter + " ,");
            }
        }
    }
}
