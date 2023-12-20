package day_014_hakan;

public class Task_45 {

    public static void main(String[] args) {
        int tekrarSayisi = 5;
        int a = 10, b = 20;

        for(int i = 1; i <= tekrarSayisi ; i ++ ){
            if(a < b){
                System.out.println(b + " büyüktür " + a + " den");
            } else if(b < a){
                System.out.println(a + " büyüktür " + b + " den");
            } else {
                System.out.println(a + " esittir " + b + " ye");
            }
        }

        System.out.println("***************************************");

        int[] arrayA = {3, 5, 7, 110, 15};
        int[] arrayB = {4, 5, 17, 15, 19};

        for(int i = 1; i <= tekrarSayisi ; i ++ ){
            if(arrayA[i-1] < arrayB[i-1]){
                System.out.println(arrayB[i-1] + "\t büyüktür " + arrayA[i-1] + "\t den");
            } else if(arrayB[i-1] < arrayA[i-1]){
                System.out.println(arrayA[i-1] + "\t büyüktür " + arrayB[i-1] + "\t den");
            } else {
                System.out.println(arrayA[i-1] + "\t esittir " + arrayB[i-1] + "\t ye");
            }
        }

    }
}
